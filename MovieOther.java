package collections;

public class MovieOther {
    private final String MovieName;
    private final String ProducerName;
    private final int ReleaseDay;
    private final String GlobalRating;

    MovieOther(String MovieName, String ProducerName, int ReleaseDate, String GlobalRating) {
        this.MovieName = MovieName;
        this.ProducerName = ProducerName;
        this.ReleaseDay = ReleaseDate;
        this.GlobalRating = GlobalRating;

    }

    public String getMovieName() {
        return MovieName;
    }

    public String getProducerName() {
        return ProducerName;
    }

    public int getReleaseDay() {
        return ReleaseDay;
    }

    public String getGlobalRating() {
        return GlobalRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieOther that = (MovieOther) o;

        if (ReleaseDay != that.ReleaseDay) return false;
        if (!MovieName.equals(that.MovieName)) return false;
        return ProducerName.equals(that.ProducerName);
    }

    @Override
    public int hashCode() {
        int result = MovieName.hashCode();
        result = 31 * result + ProducerName.hashCode();
        result = 31 * result + ReleaseDay;
        return result;
    }

}
