package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.MysqlType;

public class callableMain {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/pankaj?useSSL=false";
		String uname = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 try {
	            Connection con = DriverManager.getConnection(url, uname, password);
	            CallableStatement cstmt=con.prepareCall("{CALL updateMindsById1(?,?,?)}");
	            cstmt.setString(1, "1234");
	            cstmt.setString(2, "Engineer");
//	            cstmt.registerOutParameter(3, MysqlType.DATE);
	            boolean status = cstmt.execute();
//	            System.out.println(cstmt.getDate(3));
	            System.out.println(status);
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	}

}
