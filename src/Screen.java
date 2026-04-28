public class Screen {
    int screenId;
    String name;
    int totalSeats;
    int SeatLayout[][];

    public Screen(int screenId, String name, int totalSeats) {
        this.screenId = screenId;
        this.name = name;
        this.totalSeats = totalSeats;
        this.SeatLayout = new int[5][5];
    }

    int getScreenId() {
        return this.screenId;
    }

    int[][] getSeatLayout() {
        return this.SeatLayout;
    }

    void seatLock(int row,int col){
        if(SeatLayout[row][col] == 1){
            System.out.println("Seat already Locked");
        } else{
            this.SeatLayout[row][col] = 1;
            System.out.println("Seat Locked Successfully");
        }
    }
}
