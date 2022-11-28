package comfortInTheCloud;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainModel extends BaseModel{	
	private ArrayList <Seat> seats;
	private Seat selectedSeat; //the seat that is selected for the popup to show up
	private final ArrayList<Person> users;
	private Person currentUser; //the person that is logged in
	
	MainModel(ArrayList<Person> users){
		this.users = users;
		selectedSeat = null;
		seats = new ArrayList<>();
		for(int i = 0; i < 4 * 20; i++) {
			seats.add(SeatFactory.getInstance().createSeat(i / 4, i  % 4));
		}
	}
	
	public void addUser(Person user) {
		users.add(user);
	}
	
	public boolean checkUser(Person user) {
		for (Person p : users) {
			if (p.getName().equals(user.getName()) && p.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		
		return false;
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

	public ArrayList<Person> getUsers() {
		return users;
	}

	public Person getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(Person currentUser) {
		this.currentUser = currentUser;
	}	
	
	
}
