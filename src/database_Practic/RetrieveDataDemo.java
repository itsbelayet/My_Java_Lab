package database_Practic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDataDemo {
    public static void main(String[] args) {
        Statement statement;
        ResultSet rset;
        String retrieve="SELECT * FROM myinfo";
        try {
            statement=ConnectionDemo.connectDB().createStatement();
            rset=statement.executeQuery(retrieve);
            while (rset.next()){
                int id=rset.getInt("id");
                String name=rset.getString("name");
                String address=rset.getString("address");
                String phone=rset.getString("phone");

                System.out.println(id+" "+name+" "+address+" "+phone);
            }
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
