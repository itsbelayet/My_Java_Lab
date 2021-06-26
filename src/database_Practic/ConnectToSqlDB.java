package database_Practic;

//import jasonparserdetails.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectToSqlDB {
    // Secret.property file
    // jdbc driver
    // jdbc url
    // configure jdbc
    // MySQL Queries

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    // Load Properties file
    public static Properties loadProperties(String filePath) throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties("src/secret.properties");
        // To load all the property from Properties file
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");

        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);
        System.out.println("Database is connected");
        return connect;
    }

    // One Column
    private static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }
//    // Two Column
//    private static List<String> getResultSetData(ResultSet resultSet, String columnName1, String columnName2) throws SQLException {
//        List<String> dataList = new ArrayList<String>();
//        while (resultSet.next()) {
//            String itemName1 = resultSet.getString(columnName1);
//            String itemName2 = resultSet.getString(columnName2);
//            dataList.add(itemName1);
//            dataList.add(itemName2);
//        }
//        return dataList;
//    }

    private static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
        }
    }

    // Read data from One Column
    public static List<String> readDataBase(String tableName, String columnName) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            connectToSqlDatabase();         // it will connect with Database
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);

            // System.out.println(data);
            for (String dt : data) {
                System.out.println(dt);
            }
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            close();
        }
        return data;
    }

    // Read data from Two Column
//    public static List<String> readDataBase(String tableName, String columnName1, String columnName2) throws Exception {
//        List<String> data = new ArrayList<>();
//        try {
//            connectToSqlDatabase();// it will connect with Database
//            statement = connect.createStatement();
//            resultSet = statement.executeQuery("select * from " + tableName);
//            data = getResultSetData(resultSet, columnName1, columnName2);
//            //System.out.println(data);
//            for (String dt : data) {
//                System.out.print(dt + " ");
//            }
//        } catch (ClassNotFoundException e) {
//            throw e;
//        } finally {
//            close();
//        }
//        return data;
//    }
    // Insert Data from Array to SQL table
    public static void insertDataFromArrayToSqlTable(int[] ArrayData, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`" + columnName + "` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();

            for (int n = 0; n < ArrayData.length; n++) {
                // Insert into tableName (columnName) values()
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                ps.setInt(1, ArrayData[n]);
                ps.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Insert Data from String to SQL table
    public void insertDataFromStringToSqlTable(String ArrayData, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
            ps.setString(1, ArrayData);
            ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Query Execute
    public List<String> directDatabaseQueryExecute(String passQuery, String dataColumn) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            connectToSqlDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            close();
        }
        return data;
    }

    // Insert Data from Array List to SQL table
    public static void insertDataFromArrayListToSqlTable(List<String> list, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`" + columnName + "` varchar (20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for (String st : list) {
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                ps.setObject(1, st);
                ps.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataFromArrayListToSqlTable2(List<Student> list, String tableName, String columnName) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`SortingNumbers` bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for (Student st : list) {
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                ps.setObject(1, st);
                ps.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Insert Profile to SQL table
    public void insertProfileToSqlTable(String tableName, String columnName1, String columnName2) {
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + "," + columnName2 + " ) VALUES(?,?)");
            ps.setString(1, "Ankita Sing");
            ps.setInt(2, 3590);
            ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Read Profile From SQL table
    public static List<User> readUserProfileFromSqlTable(String tableName) throws IOException, SQLException, ClassNotFoundException {
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            Connection conn = connectToSqlDatabase();
            String query = "SELECT * FROM " + tableName + "";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                String name = rs.getString("stName");
                String id = rs.getString("stID");
                String dob = rs.getString("stDOB");
                System.out.format("%s, %s\n", name, id);
                user = new User(name, id, dob);
                list.add(user);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }

    // Insert Data from Array to SQL table
    public static void insertDataFromArrayListToSqlTable(List<String> stNameList, List<String> emailList, String tableName, String columnName, String columnName1) {
        try {

            // ALTER TABLE Customers
            //ADD Email varchar(255);
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `" + tableName + "`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `" + tableName + "` (`ID` int(11) NOT NULL AUTO_INCREMENT,`" + columnName + "` varchar (20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();
            for (String st : stNameList) {
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + " ) VALUES(?)");
                ps.setObject(1, st);
                ps.executeUpdate();
            }
            ps = connect.prepareStatement("   ALTER TABLE " + tableName + " ADD `" + columnName1 + "`varchar (200) DEFAULT NULL ");
            ps.executeUpdate();
            for (String st : emailList) {
                ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + " ) VALUES(?)");
                ps.setObject(1, st);
                ps.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectDB = new ConnectToSqlDB();

        //connect with MySQL Database
        connectToSqlDatabase();                 //

//       connectDB.readDataBase("movie","title");

        connectToSqlDatabase();
//        readDataBase("movie","title");
        System.out.println();
//        readDataBase("movie","releaseyear");
//        readDataBase("movie","genre","rating");


//      ***************** About Student File *********************************

//        List<User> list = readUserProfileFromSqlTable("students");
//        for (User user : list) {
//            System.out.println(user.getStName() + " " + user.getStID() + " " + user.getStDOB());
//        }

        int[] stID = {};
        //int[] stID = {1, 5, 7, 9};
        //insertDataFromArrayToSqlTable(stID,"stdetails","stId");
        insertDataFromArrayToSqlTable(stID, "students", "stId");

        List<String> stName = new ArrayList<>();
        stName.add("Jony");
        stName.add("Sami");
        stName.add("Lem Lem");
        stName.add(" Arib");
        insertDataFromArrayListToSqlTable(stName, "students", "stName");

        List<String> stEmails = new ArrayList<>();
        stEmails.add("Jony@gmail.com");
        stEmails.add("Sami@gmail.com");
        stEmails.add("LemLem@gmail.com");
        stEmails.add("Arib@gmail.com");
        insertDataFromArrayListToSqlTable(stName, stEmails, "students", "stName", "stEmails");
    }
}
