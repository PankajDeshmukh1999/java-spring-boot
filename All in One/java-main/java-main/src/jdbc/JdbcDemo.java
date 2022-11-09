package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");    //registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj","Pankaj","Pankajd@1999");

            Statement statement = connection.createStatement();

            String insert = "insert into employee(id,address,name) values (1,'pune','rahul')";
            String update = "update employee set name='Uday' where id =9";

            String delete = "delete from employee where name ='Uday'";

//            int i = statement.executeUpdate(insert);
            int i = statement.executeUpdate(update);
//            int i = statement.executeUpdate(delete);

            System.out.println("row inserted-> "+i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
