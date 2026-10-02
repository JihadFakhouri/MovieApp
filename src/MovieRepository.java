import java.util.ArrayList;

public interface MovieRepository {
    void add(Movie movie); // Accepterar FeatureFilm och Documentary genom Movie-types.
    ArrayList<Movie> getAll(); // Anger vilken typ som retuneras.
}
