package Java_10thClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDemo {

    public static void main(String[] args) throws Exception {
        // JDBC connection
        String url = "jdbc:mysql://localhost:3306/pnt_demo?serverTimezone=UTC";
        String user = "root";
        String password = "Miru@1964";

        Connection connection = null;
        Statement statement = null;

        Student miru=new Student(1,57,"Mohammed","Hossain","A");
        Student hiru=new Student(2,50,"Zakir","Hossain","A+");
        Student moni=new Student(3,60,"Enayet","Hossain","A++");
        Student rekha=new Student(4,58,"Ismat","Begum","B++");

        ArrayList<Student> student = new ArrayList<>();
        student.add(miru);
        student.add(hiru);
        student.add(moni);
        student.add(rekha);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            //insert into tableName(id,title) values( 5,"titanic");
            for (Student st : student) {

                // insert into tableName() values();
                String query = "insert into st_detail(id, age, fname, lname, score) " +
                        "   values(" + st.getId() + ",'" + st.getAge() + "'," + st.getFname()
                        + ",'" + st.getLname() + "','" + st.getScore() + "')      ";

                statement.execute(query);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
    }
}
