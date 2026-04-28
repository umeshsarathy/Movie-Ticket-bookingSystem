import java.util.ArrayList;
import java.util.List;

public class ScreenManagement {
    List<Screen> screens;
    ScreenManagement(){
        screens = new ArrayList<>();
    }

    void addScreens(Screen s){
        screens.add(s);
    }

    Screen getScreenById(int screenID){
        for(Screen s : screens){
            if(s.getScreenId() == screenID){
                return s;
            }
        }
        return null;
    }
    int[][] getSeatLayoutById(int screenid){
        for(Screen s : screens){
            if(s.getScreenId() == screenid){
                return s.getSeatLayout();
            }
        }
        return null;
    }
    void seatLock(int screenid,int row,int col){
        for(Screen s : screens){
            if(s.getScreenId() == screenid){
                s.seatLock(row,col);
            }
        }
    }
}
