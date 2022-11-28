package comfortInTheCloud;

public abstract class Seat extends BaseModel{
	private Person person;
	public abstract double getPrice();	
	private final boolean window;
	private final boolean longLeg;
	
	
	public Seat(boolean window, boolean longLeg) {
		super();
		this.person = null;
		this.window = window;
		this.longLeg = longLeg;
	}

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
		dispatch();
	}
	
	public abstract String seatInfo();



	public boolean isWindow() {
		return window;
	}
	public boolean isLongLeg() {
		return longLeg;
	}
}