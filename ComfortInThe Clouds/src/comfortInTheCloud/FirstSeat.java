 package comfortInTheCloud;

//singleton: one FirstSeat's alteration alters all the first class seats!
public class FirstSeat extends Seat {
	public FirstSeat(boolean window, boolean longLeg) {
		super(window, longLeg);
	}

	private static double price = 5000;

	public double getPrice() {
		return FirstSeat.price;
		
	}

	public String seatInfo() {
		StringBuilder info = new StringBuilder();
		info.append("SEAT INFORMATION:" + "\n");
		if (getPerson() != null) {
			info.append("Customer's name: " + this.getPerson().getName() + "\n");
		}
		info.append("Chosen to fly First class." + "\n" + "Total price (extra costs included): $" + (getPrice() + getExtraPrice())
				+ "\n");
		if (this.isWindow()) {
			info.append("You have chosen a window seat. Total flight price increased by 10 dollars" + "\n");
		} else {
			info.append("You have not chosen a window seat. No extra charges made" + "\n");
		}

		if (this.isLongLeg()) {
			info.append("You have chosen a long-leg seat. Total flight price increased by 20 dollars" + "\n");
		} else {
			info.append("You have not chosen a long-leg seat. No extra charges made" + "\n");
		}
		info.append("First Class Food Options: (1)Regular Meal (2)Vegan Meal (3)Gluten Free Meal" + "\n");
		info.append("Number of Carry-on Luggage Allowed: 3");
		return info.toString();
	}
}
