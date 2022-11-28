package comfortInTheCloud;

//singleton: one EconomySeat;s alteration alters all the economy seats!
public class EconomySeat extends Seat{
	public EconomySeat(boolean window, boolean longLeg) {
		super(window, longLeg);
	}

	private static double price = 100;
	public double getPrice() {
		return EconomySeat.price;
	}
	
	public String seatInfo() {
		StringBuilder info = new StringBuilder();
		info.append("SEAT INFORMATION:" + "\n");
		if (getPerson() != null) {
			info.append("Customer's name: " + this.getPerson().getName() + "\n");
		}
      
      info.append("Chosen to fly Economy Class." + "\n" + "Total price (extra costs included): $" + (getPrice()+getExtraPrice()) + "\n");
      if(this.isWindow()) {
        	info.append("You have chosen a window seat. Total flight price increased by 20 dollars" + "\n");
        }
        else {
        	info.append("You have not chosen a window seat. No extra charges made"+ "\n");
        }
        
        if(this.isLongLeg()) {
        	info.append("You have chosen a long-leg seat. Total flight price increased by 10 dollars" + "\n");
        }
        else {
        	info.append("You have not chosen a long-leg seat. No extra charges made" + "\n");
        }
      info.append("Economy Class Food Options: (1)Regular Meal (2)Vegan Meal (3)Gluten Free Meal" +  "\n");
      info.append("Number of Carry-on Luggage Allowed: 1");
      return info.toString();
	}
}
