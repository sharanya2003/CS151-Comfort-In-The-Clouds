package comfortInTheCloud;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainModel extends BaseModel{	
	ArrayList <Seat> seats;
	Seat selectedSeat; //the seat that is selected for the popup to show up
	
	MainModel(){
		selectedSeat = null;
		seats = new ArrayList<>();
		for(int i = 0; i < 4 * 20; i++) {
			seats.add(SeatFactory.getInstance().createSeat(i / 4, i  % 4));
		}
	}
	
	public Seat getSelectedSeat() {
		return selectedSeat;
	}

	public void setSelectedSeat(Seat seat) {
		selectedSeat = seat;
		dispatch();
		
	}
	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	
}
