package database_Practic;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.Callable;

public class ConnectionDemo {
    public static Connection connectDB(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/pnt_demo","root","Miru@1964");
            System.out.println("Database Connected Successfully");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Hi! Database Not Connected");
        }
        return connection;
    }
}
