package comfortInTheCloud;

public class SeatFactory {
	
	private SeatFactory() {
		
	}
	
	public Seat createSeat(int r, int c) {
		Seat seat;
		//differentiate first class seat
		if(r<5) {
			seat = new FirstSeat();
		}
		
		//differentiate business seat price
		if(r>=5 && r<11) {
			seat = new BusinessSeat();
		}
		//differentiate economy seat class
		else {
			seat = new EconomySeat();
		}
		
		
		//differentiate window
		if(c==0) {
			seat.setWindow();
		}
		
		
		//differentiate long-leg
		
		if(r==1 || r==5 || r==12) {
			seat.setLongLeg();
		}
		
		
		return seat;
	}
	
	public static SeatFactory getSeatFactory() {
		return this;
		
	}

}
