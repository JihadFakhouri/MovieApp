import java.util.ArrayList;

public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository; // Samma repository sparas i sevicefältet.
    }

    public void addMovie(Movie movie) {
        movieRepository.add(movie); // Skickar filmen vidare till repository.
    }

    public void printAllMovies() {
        ArrayList<Movie> movies = movieRepository.getAll(); // Här hämtar vi lagrade filmer
        for (Movie movie : movies) {
            System.out.println(movie.describe()); // Skriver rätt filmtypes beskrivning.
        }
    }
    public int getMovieCount() {
        return movieRepository.getAll().size();
    }
}
