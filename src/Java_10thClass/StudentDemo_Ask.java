package Java_10thClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDemo_Ask {

    public static void main(String[] args) throws Exception {
        // JDBC connection
        String url = "jdbc:mysql://localhost:3306/pnt_demo?serverTimezone=UTC";
        String user = "root";
        String password = "Miru@1964";

        Connection connection = null;
        Statement statement = null;

        String[][] table = {
                {"01", "Mohammed", "Hossain", "A+"},
                {"02", "Belayet ", "Hossain", "A"},
                {"03", "Enayet", "Hossain", "B+"},
                {"04", "Ismat", "Begum", "A++"}
        };

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            //insert into tableName(id,title) values( 5,"titanic");
            for (String[] obj : table) {
                for (String ob : obj) {
                    String query = "insert into st_detail(id, fname, lname, score) " +
                            "   values(" + ob+")";
                    //String query1="select * from movies";
                    statement.execute(query);
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
    }
}
