import java.util.ArrayList;

public class MovieApp {
    public static void main(String[] args) {
        MovieRepository movieRepository = new ConsoleMovieRepository(); //Skapar EN lagringsinstans.
        MovieService movieService = new MovieService(movieRepository); // Skickar in samma instans.
        movieService.addMovie(new FeatureFilm("Shrek", 90, "Animation")); // Startar lagringkedjan.
        movieService.addMovie(new Documentary("Övningsdokumentär", 55, "Filmhistoria"));

//        System.out.println("Filmer i listan: " + movieRepository.getAll().size()); // Visar lagringen före utskrift.
        movieService.printAllMovies(); // Visar vad som finns i listan.
        System.out.println("Antal filmer: " + movieService.getMovieCount());
    }
}




//        ArrayList<Movie> movies = new ArrayList<>();
//
//        movies.add(new FeatureFilm("Shrek", 90, "Animation"));
//        movies.add(new FeatureFilm("Sista natten med gänget", 110, "Drama"));
//        movies.add(new FeatureFilm("Nyckeln till frihet", 140, "Drama"));
//        movies.add(new Documentary("Övningsdokumentären", 55, "Filmhistoria"));
//        movies.add(new FeatureFilm("Snowwhite", 120, "Drama"));
//        movies.add(new Documentary("Livet", 45, "Drama"));
//
//        for (Movie movie : movies) {
//            System.out.println(movie.describe());
//        }
