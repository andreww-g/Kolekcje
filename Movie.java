package collections;

public class Movie {
    private String MovieName;
    private String ProducerName;
    private int ReleaseDate;
    private String GlobalRatings;
    


    Movie(String MovieName, String ProducerName, int ReleaseDate, String GlobalRatings)
    {
        this.MovieName = MovieName;
        this.ProducerName = ProducerName;
        this.ReleaseDate = ReleaseDate;
        this.GlobalRatings = GlobalRatings;
    }

    public String getMovieName() {
        return MovieName;
    }

    public String getProducerName() { return ProducerName; }

    public int getReleaseDate() {
        return ReleaseDate;
    }

    public String getGlobalRatings() {
        return GlobalRatings;
    }
}
