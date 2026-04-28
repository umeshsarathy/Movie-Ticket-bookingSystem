import java.util.ArrayList;
import java.util.List;

public class ShowtimeManagement {
    List<Showtime> shows;
    ShowtimeManagement(){
        shows = new ArrayList<>();
    }
    void addShows(Showtime show){
        shows.add(show);
    }
    List<Showtime> getShows(int movieId){
        List<Showtime> currshows = new ArrayList<>();
        for(Showtime s : shows){
            if(s.getMovieId() == movieId){
                currshows.add(s);
            }
        }
        return currshows;
    }
    Showtime getShowById(int id){
        for(Showtime s : shows){
            if(s.getShowtimeId() == id){
                return s;
            }
        }
        return null;
    }
}
