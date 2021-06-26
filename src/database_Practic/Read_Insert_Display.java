package database_Practic;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Read_Insert_Display {
    private String empName;
    private int empSalary, empDeptId;

    // Read data from txt file
    public void readData() {
        try (Scanner input = new Scanner(new File("src/emp_data.txt"))) {
            while (input.hasNextLine()) {
                empName = "";
                String line;
                line = input.nextLine();

                // If the line variable has no data then re-iterate the loop to move on the next line
                if(line.length()<=0)
                    continue;

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

                System.out.println(empName + "\t" + empSalary + "\t" + empDeptId);

                //saveData();         // Save data to sql table

                displayData();      // Retrive data from sql table and display

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void displayData(){
        try(Connection conn=connect();
            Statement stat=conn.createStatement()){
            boolean hasResultSet=stat.execute("SELECT * FROM employes");
            if(hasResultSet){
                ResultSet result=stat.getResultSet();
                ResultSetMetaData metaData=result.getMetaData();

                // Get Number of Column
                int columnCount=metaData.getColumnCount();

                // Display Column Labels
                for(int i=1; i<=columnCount; i++){
                    System.out.println(metaData.getColumnLabel(i)+"\t\t");
                }
                System.out.println();

                // Display Data
                while (result.next()){
                    System.out.printf("%-20s%10d%10d%n",result.getString("Name"),result.getInt("Salary"),result.getInt("DeptId"));
                }
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    private Connection connect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pnt_demo", "root", "Miru@1964");
            System.out.println("Database Connected Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hi! Database Not Connected");
        }
        return connection;
    }

    private void saveData() {
        try (Connection conn = connect();
             PreparedStatement pstat = conn.prepareStatement("INSERT INTO employes VALUES (?,?,?)")) {
            pstat.setString(1, empName);
            pstat.setInt(2, empSalary);
            pstat.setInt(3, empDeptId);
            pstat.executeUpdate();
        } catch (SQLException e) {
            System.out.print(e);
        }
    }
}
