import java.util.ArrayList;
import java.util.List;

public class MovieManagement {
    List<Movie> movies;
    MovieManagement(){
        movies = new ArrayList<>();
    }
    void addMovie(Movie movie){
        movies.add(movie);
    }
    void removeMovie(Movie movie){
        movies.remove(movie);
    }
    boolean isMovieExists(String movieTitle){
        for(Movie m : movies){
            if(m.getTitle().equals(movieTitle)){
                return true;
            }
        }
        return false;
    }
    List<Movie> getMoviesByLang(String lang){
        List<Movie> moviesByLang = new ArrayList<>();
        for(Movie m : movies){
            if(m.getLang().equals(lang)){
                moviesByLang.add(m);
            }
        }
        return moviesByLang;
    }
    Movie getMovie(String title){
        for(Movie m : movies){
            if(m.getTitle().equals(title)){
                return m;
            }
        }
        return null;
    }
}
