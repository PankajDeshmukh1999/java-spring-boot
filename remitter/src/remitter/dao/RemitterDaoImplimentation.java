package remitter.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import remitter.entity.BeneficiaryInfo;
import remitter.entity.FundTransfer;
import remitter.entity.RemitterInfo;

public class RemitterDaoImplimentation {

	public int addRemitter(RemitterInfo info) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String uname = "root";
		String password = "root";
		String query = "INSERT INTO remitter_info VALUES(?,?,?,?,?,?,?)";
		int status = 0;
		try (Connection co = DriverManager.getConnection(url, uname, password);
				PreparedStatement ps = co.prepareStatement(query)) {
			ps.setInt(1, info.getAccountNumber());
			ps.setString(2, info.getName());
			ps.setString(3, info.getEmailId());
			ps.setString(4, info.getPassword());
			ps.setDouble(5, info.getBalance());
			ps.setString(6, info.getAccountStatus());
			ps.setString(7, info.getIfscCode());

			status = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public int addBeneficiary(BeneficiaryInfo info) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String uname = "root";
		String password = "root";
		String query = "INSERT INTO beneficiary_info VALUES(?,?,?,?,?,?)";
		int status = 0;

		try (Connection co = DriverManager.getConnection(url, uname, password);
				PreparedStatement pst = co.prepareStatement(query)) {
			pst.setInt(1, info.getAccountNumber());
			pst.setString(2, info.getName());
			pst.setString(3, info.getBankName());
			pst.setString(4, info.getIfscCode());
			pst.setDouble(5, info.getCurrentBalance());
			pst.setString(6, info.getEmail());

			status = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public boolean loginRemitter(int accountNumber, String password) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String uname = "root";
		String password1 = "root";
		int ac = 0;
		String ps = null;
		String query = "select account_no,password from remitter_info where account_no=? and password=?";
		boolean status = false;
		try (Connection co = DriverManager.getConnection(url, uname, password1);
				PreparedStatement pst = co.prepareStatement(query)) {
			pst.setInt(1, accountNumber);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				ac = rs.getInt(1);
				ps = rs.getString(2);

			}
			
			if (ac == accountNumber && ps.equals(password)) {
				System.out.println("Login successfully done.....");
				status=true;
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public int fundTransfer(int rac,int bac,double amount) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String uname = "root";
		String password1 = "root";
		String query="select account_no,account_number,remitter_info.balance from remitter_info , beneficiary_info where account_no=? and account_number=?";
		int ra=0;
		int ba=0;
		double am=0.0;
		String status = null;
		int action=0 ;
		try (Connection co = DriverManager.getConnection(url,uname,password1);
				PreparedStatement ps = co.prepareStatement(query)) {
				ps.setInt(1,rac);
				ps.setInt(2,bac);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					ra=rs.getInt(1);
					ba=rs.getInt(2);
					am=rs.getDouble(3);
				}
				if(ra==rac && ba==bac && am>amount && amount>0) {
					status="success";
					System.out.println("done");
					String insertQuery="INSERT INTO fund_transfer(beneficiary_account_number,transaction_amount,remitter_account_number,transaction_status,transaction_date) values(?,?,?,?,?)";
					PreparedStatement pst = co.prepareStatement(insertQuery); 
					FundTransfer ft = new FundTransfer();
					pst.setInt(1, bac);
					pst.setDouble(2, amount);
					pst.setInt(3, rac);
					pst.setString(4, status);
					Date d = new Date(ft.getTransactionDate().getTime());
					pst.setDate(5,d);
					action = pst.executeUpdate();
				} if(amount<0) {
					System.out.println("invalid amount");
				}
				else {
					status="Failed";
					String insertQuery="INSERT INTO fund_transfer(beneficiary_account_number,transaction_amount,remitter_account_number,transaction_status,transaction_date) values(?,?,?,?,?)";
					PreparedStatement pst = co.prepareStatement(insertQuery); 
					FundTransfer ft = new FundTransfer();
					pst.setInt(1, bac);
					pst.setDouble(2, amount);
					pst.setInt(3, rac);
					pst.setString(4, status);
					Date d = new Date(ft.getTransactionDate().getTime());
					pst.setDate(5,d);
					action = pst.executeUpdate();
					System.out.println("fail........");
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return action;
	}
}
