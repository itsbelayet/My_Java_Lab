package Java_10thClass;

public class Movie {

    private int id,releaseYear;
    private String title,genre,rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Movie(int id,String title, int releaseYear,  String genre, String rating){
        this.id=id;
        this.releaseYear=releaseYear;
        this.title=title;
        this.genre=genre;
        this.rating=rating;
    }
}
