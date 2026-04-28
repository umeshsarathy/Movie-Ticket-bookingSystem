### Problem Statement: Movie Ticket Booking System
#### Flow:
 - Customer can search the movie either by its title or language.
 - Then he selects the movie, The system shows the available showtime for the selected movie
 - Then he selects the show, the system shows the seat layout specifiying the occupied seat as 1 and unoccupied seat as 0
 - if the user selects the valid seat (seat specifying 0) the seat will be booked, otherwise the system prompts "Seat already booked"
#### Approach:
 - created separate class for Movie, Screen, Showtime for holding the details 
 - created separate class for MovieManagement, ScreenManagement, ShowtimeManagement for managing the activies like adding movies, retrieving the objects
 - created Main class to run until the user wants to exit, which had the logic of the flow
#### Execution : 
 - run the Main.java file
 - run the following commands : 
 - javac Main.java
 - java Main
    