package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");    //registering driver
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj","Pankaj","Pankajd@1999");

            String select = "select * from employee";
            Statement statement= connection.createStatement();
            ResultSet set = statement.executeQuery(select);

            //for column
            ResultSetMetaData setMetaData = set.getMetaData();
            System.out.println(setMetaData.getColumnName(1)+" "+setMetaData.getColumnName(2)+" "+ setMetaData.getColumnName(3));

            while (set.next()){ //calling row data only
                System.out.println(set.getInt("id")+" "+ set.getString("name")+" "+set.getString("address"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
