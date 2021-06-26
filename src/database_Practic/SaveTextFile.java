package database_Practic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SaveTextFile {
    private static final String DB_Driver_Class="com.mysql.cj.jdbc.Driver";
    private static final String DB_UserName="root";
    private static final String DB_Password="Miru@1964";
    private static final String DB_URL="jdbc:mysql://localhost:3306/pnt_demo";
    private static Connection connection=null;
    static {
        try {
            Class.forName(DB_Driver_Class);
            connection= DriverManager.getConnection(DB_URL,DB_UserName,DB_Password);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
