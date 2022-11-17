package jdbc.firstDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	/**
	 * 1.Load driver class 2.create connection 3.create statement 4.execute query
	 * 5.close all resources
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int ch;
		Main m = new Main();
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1.Register new Minds \t 2.Get all minds \t 3.Update minds \t 4.Delete mind by id \t 5.Exit");
			 ch = s.nextInt();
			 s.nextLine();
			switch (ch) {
			case 1: {
				m.resgisterNewMind();
				break;
			}
			case 2: {
				m.retraiveAllMind();
				break;
			}
			case 3: {
				m.updateMinds();
				break;
			}
			case 4:{
				m.deleteMindById();
				break;
			}
			case 5:{
				System.out.println("Exit");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (ch > 0 && ch < 5);
	}

	public static void updateMinds() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/pankaj?useSSL=false";
		String uname = "root";
		String password = "root";
//		String query = "update minds set mind_designation='Tester' where minds_id=1082861";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mid:");
		int mid = sc.nextInt();

		Connection co = DriverManager.getConnection(url, uname, password);
		Statement st = co.createStatement();
		
//		int result = st.executeUpdate(query);	
//		int result1 = st.executeUpdate("update minds set mind_designation='Developer' where minds_id='" + mid + "'");
//		System.out.println("update successfully done-" + result1);
		
		PreparedStatement pst = co.prepareStatement("update minds set mind_designation=? where minds_id=?");
		pst.setString(1,"Tester");
		pst.setInt(2, mid);
		int result = pst.executeUpdate();
		System.out.println("update is done");
		pst.close();
		co.close();

	}

	public static void deleteMindById() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/pankaj?useSSL=false";
		String uname = "root";
		String password = "root";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mid:");
		int mid = sc.nextInt();
		
//		System.out.println("Enter delete query");
//		String q = sc.nextLine();
		Connection co = DriverManager.getConnection(url, uname, password);
		Statement st = co.createStatement();

		int result = st.executeUpdate("DELETE from minds where minds_id='" + mid + "'");
//		int result1 = st.executeUpdate(q);
		System.out.println("id record is deleted -" + result);

		st.close();
		co.close();
	}

	public static void retraiveAllMind() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/pankaj?useSSL=false";
		String uname = "root";
		String password = "root";
		String query = "select * from minds";
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection co = DriverManager.getConnection(url, uname, password);
		Statement st = co.createStatement();

		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " "
					+ rs.getString(5));
		}
		st.close();
		co.close();
	}

	public static void resgisterNewMind() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Minds m = new Minds();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minds id:");
		m.setMind_id(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter minds Name:");
		m.setMind_name(sc.nextLine());

		System.out.println("Enter minds Designation:");
		m.setMind_designation(sc.nextLine());

		System.out.println("Enter minds Phone number:");
		m.setPhone(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter minds Email:");
		m.setEmail(sc.nextLine());

		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj?useSSL=false", "root", "root");
//		Statement st = co.createStatement();
//		int result = st.executeUpdate("INSERT INTO minds values('" + m.getMind_id() + "','" + m.getMind_name() + "','"
//				+ m.getMind_designation() + "','" + m.getPhone() + "','" + m.getEmail() + "')");
//		System.out.println("Result: " + result);
		
		PreparedStatement pst = co.prepareStatement("INSERT INTO minds values(?,?,?,?,?)");
		pst.setInt(1, m.getMind_id());
		pst.setString(2, m.getMind_name());
		pst.setString(3, m.getMind_designation());
		pst.setInt(4, m.getPhone());
		pst.setString(5, m.getEmail());
		
		int result = pst.executeUpdate();
		System.out.println("inserted :"+result);

		pst.close();
		co.close();
	}
}
