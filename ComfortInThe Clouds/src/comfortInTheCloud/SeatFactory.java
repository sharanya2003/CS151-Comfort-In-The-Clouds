package comfortInTheCloud;

public class SeatFactory {
	
	
	private static SeatFactory instance = null;
	//constructor
	private SeatFactory() {	
	}
	
	
	public Seat createSeat(int r, int c) {

		boolean window = c==0 || c==3;
		boolean legRoom = r==0 || r==4 || r==12;
		//differentiate first class seat
		if(r<5) {
			return new FirstSeat(window, legRoom);
		}
		
		//differentiate business seat price
		if(r>=5 && r<12) {
			return new BusinessSeat(window, legRoom);
		}
		//differentiate economy seat class
		return new EconomySeat(window, legRoom);
	}
	
	public static SeatFactory getInstance() {
		 if(instance==null) {
			 instance = new SeatFactory();
		 }
		 return instance;
		
	}

}
