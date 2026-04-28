import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieManagement mms = new MovieManagement();
        ShowtimeManagement stms = new ShowtimeManagement();
        ScreenManagement scms = new ScreenManagement();
        mms.addMovie(new Movie(1,"LIK","Romance","Tamil",3.5,2));
        mms.addMovie(new Movie(2,"Youth","Comedy","Tamil",4.5,2.5));
        mms.addMovie(new Movie(3,"With Love","Romance","Tamil",4,1.5));

        stms.addShows(new Showtime(1,1,1,9,11,250));
        stms.addShows(new Showtime(2,1,2,9,11,250));
        stms.addShows(new Showtime(3,2,1,11,13,250));
        stms.addShows(new Showtime(4,3,2,11,13,250));

        scms.addScreens(new Screen(1,"Babu",780));
        scms.addScreens(new Screen(2,"PVR",780));
        boolean loop = true;
        while(loop){
            System.out.println("Search a Movie");
            System.out.println("1. By title\n2. By language\n3. quit");
            System.out.println("Enter the choice id : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter movie Title: ");
                    String title = sc.next();

                    if(mms.isMovieExists(title)){
                        System.out.println(mms.getMovie(title).toString());
                        System.out.println("Enter the movie ID: ");
                        int mID = sc.nextInt();
                        List<Showtime> shows = stms.getShows(mID);
                        System.out.println("Available Shows");
                        for(Showtime s : shows){
                            System.out.println(s.toString());
                        }
                        System.out.println("Select Show id : ");
                        int showid = sc.nextInt();
                        Showtime selectedShow = stms.getShowById(showid);

                        int screenid = selectedShow.getScreenId();
                        //
                        int[][] screenLayout = scms.getSeatLayoutById(screenid);

                        for(int i=0;i<screenLayout.length;i++){
                            System.out.println(Arrays.toString(screenLayout[i]));
                        }
                        System.out.println("Select row and col to lock");
                        int row = sc.nextInt();
                        int col = sc.nextInt();
                        scms.seatLock(screenid,row,col);
                    } else{
                        System.out.println("Movie Doesnot exist");
                    }
                    break;
                case 2:
                    System.out.println("Enter movie language: ");
                    String lang = sc.next();
                    List<Movie> movies = mms.getMoviesByLang(lang);
                    if(movies.isEmpty()){
                        System.out.println("No movies Found");
                    }else{
                        for(Movie m : movies){
                            System.out.println(m.toString());
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Exiting....");
                    loop = false;
                    break;

                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}