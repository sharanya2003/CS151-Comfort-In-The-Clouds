package comfortInTheCloud;

public abstract class Seat {
	private Person person;
	public abstract double getPrice();	
	private boolean window = false;
	private boolean longLeg = false;
	
	
	
	public double getExtraPrice() {
		return (isLongLeg() ? 20 : 0) + (isWindow() ? 10: 0);
	}
	

	
	public boolean isEmpty() {
		return this.getPerson()==null;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public void setPerson(Person p) {
		this.person = p;
	}
	
	public abstract String seatInfo();



	public boolean isWindow() {
		return window;
	}



	public void setWindow() {
		this.window = true;
	}



	public boolean isLongLeg() {
		return longLeg;
	}



	public void setLongLeg() {
		this.longLeg = true;
	}
}