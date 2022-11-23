package comfortInTheCloud;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainModel extends BaseModel{	
	ArrayList <Seat> seats;
	
	MainModel(){
		seats = new ArrayList<>();
		for(int i = 0; i < 4 * 20; i++) {
			seats.add(SeatFactory.getInstance().createSeat(i / 4, i  % 4));
		}
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	
}
