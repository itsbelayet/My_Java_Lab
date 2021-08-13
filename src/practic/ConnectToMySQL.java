package practic;

import com.mysql.cj.xdevapi.SelectStatement;

import java.sql.*;
import java.util.ArrayList;

public class ConnectToMySQL {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String userName="root";
        String passWord="Miru@1964";
        String dbName="pnt_demo";

        String url="jdbc:mysql://localhost:3306/"+dbName+"?serverTimezone=UTC&useSSL=false";

        String query="Select * from movie;";
        //String queryIn="insert into movie values(3,'Bader Meay Jasna',1995,'Romance','PG-03');";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection(url,userName,passWord);
        Statement statement=connection.createStatement();
        ResultSet table=statement.executeQuery(query);

        //ResultSet table=statement.executeQuery(queryIn);

        // Creating an Array
        ArrayList<String> names=new ArrayList<>();

        while (table.next()){
            int idFromDb=table.getInt("id");
            String titleFromDb=table.getString("title");
            int releaseYearFromDb=table.getInt("releaseYear");
            String ratingFromDb=table.getString("rating");

            names.add(titleFromDb); // Adding data to Array

            System.out.println(idFromDb+"  "+titleFromDb+"  "+releaseYearFromDb+"  "+ratingFromDb);
        }
        // For print the Array
        System.out.println(names);
        
        connection.close();
        statement.close();
    }
}
