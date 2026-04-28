public class Showtime {
    int showtimeId;
    int movieId;
    int screenId;
    int startTime;
    int endTime;
    int pricing;

    public Showtime(int showtimeId, int movieId, int screenId, int startTime, int endTime, int pricing) {
        this.showtimeId = showtimeId;
        this.movieId = movieId;
        this.screenId = screenId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pricing = pricing;

    }
    int getMovieId(){
        return this.movieId;
    }

    int getShowtimeId(){
        return this.showtimeId;
    }
    int getScreenId(){
        return this.screenId;
    }

    @Override
    public String toString(){
        return "showtimeId: " + this.showtimeId +
                " Movie ID: " + this.movieId +
                " Screen ID: " + this.screenId +
                " startTime: " + this.startTime +
                " endTime: " + this.endTime +
                " pricing: " + this.pricing;
    }
}
