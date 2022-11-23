package comfortInTheCloud;

public class SeatFactory {
	
	
	private static SeatFactory instance = null;
	//constructor
	private SeatFactory() {
		
	}
	
	
	public Seat createSeat(int r, int c) {
		Seat seat;
		
		boolean window = c==0;
		boolean legRoom = r==1 || r==5 || r==12;
		//differentiate first class seat
		if(r<5) {
			seat = new FirstSeat(window, legRoom);
		}
		
		//differentiate business seat price
		if(r>=5 && r<11) {
			seat = new BusinessSeat(window, legRoom);
		}
		//differentiate economy seat class
		else {
			seat = new EconomySeat(window, legRoom);
		}

		
		
		return seat;
	}
	
	public static SeatFactory getInstance() {
		 if(instance==null) {
			 instance = new SeatFactory();
		 }
		 return instance;
		
	}

}
