public class Movie {
    int movieId;
    String title;
    String genre;
    String language;
    double rating;
    double duration;
    Movie(int movieId,String title,String genre,String language,double rating,double duration){

        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.rating = rating;
        this.duration = duration;
    }
    String getTitle(){
        return this.title;
    }
    String getLang(){
        return this.language;
    }
    int getId(){
        return this.movieId;
    }
    @Override
    public String toString(){
        return "Movie Id: " + this.movieId +
                " Title : " + this.title+
                " Language: " + this.language +
                " Genre: " + this.genre +
                " Rating " + this.rating +
                " duration :" + this.duration;
    }
}
