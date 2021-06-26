package Java_10thClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieDemo {
    // Direct Approach to connect with DB

    public static void main(String[] args) throws Exception {
        // JDBC connection
        String url = "jdbc:mysql://localhost:3306/pnt_demo?serverTimezone=UTC";
        String user = "root";
        String password = "Miru@1964";

        Connection connection = null;
        Statement statement = null;

        Movie titanic = new Movie(5, "Titanic", 1997, "Romance", "PG-13");
        Movie grudge = new Movie(6, "Grudge", 2003, "Horror", "PG-13");
        Movie inception = new Movie(7, "Inception", 2010, "Thriller", "PG-15");
        Movie fatPizza = new Movie(9, "Fat Pizza", 2021, "Thriller", "PG-17");
        Movie deadPool = new Movie(12, "Dead Pool", 2020, "Action", "PG-12");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(titanic);
        movies.add(grudge);
        movies.add(inception);
        movies.add(fatPizza);
        movies.add(deadPool);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            //insert into tableName(id,title) values( 5,"titanic");
            for (Movie mv : movies) {
                // insert into tableName() values();
                String query = "insert into movie (id, title, releaseYear, genre, rating) " +
                        "   values(" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleaseYear()
                        + ",'" + mv.getGenre() + "','" + mv.getRating() + "')      ";
                //String query1="select * from movies";
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
