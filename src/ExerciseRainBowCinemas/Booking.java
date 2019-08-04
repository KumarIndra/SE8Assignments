package ExerciseRainBowCinemas;

public class Booking {
	private String customerEmail; 
	private int seatsRequired;
	private boolean isBooked;
	private static int seatsAvailable = 400;
	
	public Booking(String customerEmail,int seatsRequired) {
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;
		if(seatsRequired<=Booking.seatsAvailable) {
			this.setBooked(true);
			Booking.seatsAvailable-=seatsRequired;
		}else {
			this.isBooked = false;
		}
		
	}
	
	public void showBookingStatus() {
		if(this.isBooked) {
			System.out.println(this.seatsRequired+" seats succesfully booked for "+this.customerEmail);
		}else {
			System.out.println("Sorry "+this.customerEmail+", not enough seats! seats available: "+Booking.seatsAvailable);
		}
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
		
	}
	
	
}
