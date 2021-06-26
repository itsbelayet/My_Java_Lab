package database_Practic;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataDemo {
    public static void main(String[] args) {
        PreparedStatement ps;
        int Id = 50;
        String Name = "Zakir";
        String Address = "Bangladesh";
        String Phone = "718-502-3475";

        String insert = "INSERT INTO myinfo (Id, Name, Address, Phone) VALUES (?,?,?,?)  ";
        try {
            ps = ConnectionDemo.connectDB().prepareStatement(insert);

            ps.setInt(1, Id);
            ps.setString(2, Name);
            ps.setString(3, Address);
            ps.setString(4, Phone);

            if (ps.executeUpdate() > 0) {
                System.out.println("Successfully Data Inserted");
            } else {
                System.out.println("Not Inserted");
            }
        } catch (SQLException en) {
            Logger.getLogger(InsertDataDemo.class.getName()).log(Level.SEVERE, null, en);
        }
    }

}
