package database_Practic.LearnConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ConnectDB {

    public static void main(String[] args) throws SQLException {
        String userName="root",password="Miru@1964",dbName="pnt_demo";

        // jdbc:mysql   =   Driver Name
        // localhost    =   Host Name
        // 3306         =   Port Number

        String url="jdbc:mysql://localhost:3306/"+dbName+"?serverTimezone=UTC&useSSL=false";
        String query="Select * from employes;";

        // SSL error    =   ?useSSL=false
        // server limezone= ?serverTimezone=UTC
        // both         =   ?serverTimezone=UTC&useSSL=false

        try{
            Class.forName("com.mysql..cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception Occured in Driver");
           //e.printStackTrace();
        }

        Connection connection= DriverManager.getConnection(url, userName,password);
        Statement statement= connection.createStatement();
        ResultSet table=statement.executeQuery(query);

        ArrayList<String> arrayName=new ArrayList<>();

        while (table.next()){
            int idFromTable=table.getInt("DeptId");
            int salaryFromTable=table.getInt("Salary");
            String nameFromTable=table.getString("Name");
            System.out.println(idFromTable+" "+nameFromTable+" "+salaryFromTable);

            arrayName.add(nameFromTable);
        }
        System.out.println(arrayName);

        statement.close();
        connection.close();
    }
}
