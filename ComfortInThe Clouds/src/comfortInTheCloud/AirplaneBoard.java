package comfortInTheCloud;

public class AirplaneBoard {
	
	private Seat [][] planeBoard = new Seat [4][20];
	//starts every seat off as null meaning that there is no person inside of there
	
	
	/*
	 * 
	 * everything in the A row (ie where planeBoard[i][0]) is 20 dollars more because its window seat
	 * everything in row 1, row 5, row 12 start a new row (have more leg room) so it is 10 dollars more because it is long-legged seating
	 * 	
	 * A B C D
		N N N N 1
		N N N N 2
		N P N N 3
		N N N N 4 //until row 4 is first
		N N N N 5 
		N N N T 6
		T N N N 7
		N N N N 8
		N P N N 9
		N N N N 10
		N N N N 11 // row 5 to 11 inclusive is business
		N N N N 12
		N P N N 13
		N N N N 14
		N N N N 15
		N N N P 16
		P N N N 17
		N N N N 18
		N P N N 19
		N N N N 20 //rest are economy
	 * 
	 * 
	 * 
	 * */
	
	//constructor
	
	public AirplaneBoard() {
		
		for(int r=0; r<planeBoard.length; r++) {
			for(int c=0; c<planeBoard[r].length; c++) {
				planeBoard[r][c] = SeatFactory.getInstance().createSeat(r, c);
			}
		}

	}
}
