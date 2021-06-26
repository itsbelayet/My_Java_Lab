package database_Practic;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataManipulation {
    private String empName;
    private int empSalary;
    private int empDeptId;

    public void readData() {
//        String empName;
//        int empSalary = 0, empDeptId = 0;

        try (Scanner input = new Scanner(new File("src/emp_data.txt"))) {
            while (input.hasNextLine()) {
                empName = "";
                String line;
                line = input.nextLine();

                // now process the line of text for each data item
                try (Scanner data = new Scanner(line)) {
                    while (!data.hasNextInt()) {
                        empName += data.next() + " ";
                    }
                    empName = empName.trim();
                    // get Salary (check int type)
                    if (data.hasNextInt()) {
                        empSalary = data.nextInt();
                    }
                    if (data.hasNextInt()) {
                        empDeptId = data.nextInt();
                    }
                }
                // check data
                System.out.println(empName + "\t" + empSalary + "\t" + empDeptId);

//                Employes ep= new Employes();
//                ep.saveData(); // Save data to sql table
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void saveData() {
        PreparedStatement ps;
        String insert = "INSERT INTO employes (empName, empSalary, empDeptId) VALUES (?,?,?)";
        try {
            ps = ConnectionDemo.connectDB().prepareStatement(insert);
            ps.setString(1, empName);
            ps.setInt(2, empSalary);
            ps.setInt(3, empDeptId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertData() {
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

    public void retrieveData() {
        Statement statement;
        ResultSet rset;
        String retrieve = "SELECT * FROM employes";

        try {
            statement = ConnectionDemo.connectDB().createStatement();
            rset = statement.executeQuery(retrieve);
            while (rset.next()) {
                String empName = rset.getString("empName");
                int empSalary = rset.getInt("empSalary");
                int empDeptId = rset.getInt("empDeptId");

                System.out.println(empName + " " + empSalary + " " + empDeptId);
            }
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
