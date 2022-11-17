package jdbc.firstDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	static String query = "select * from employee";
	static String query1 ="select * from employee where salary>=16000";

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj", "root", "root");
			Statement st = co.createStatement();
			ResultSet rs = st.executeQuery(query1);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
