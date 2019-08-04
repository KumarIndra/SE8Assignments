package ExerciseRainBowCinemas;

public class BookingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking booking1 = new Booking("Jack@infy.com",100);
		Booking booking2 = new Booking("Jill@infy.com",200);
		Booking booking3 = new Booking("Jamie@infy.com",200);
		
		booking1.showBookingStatus();
		booking2.showBookingStatus();
		booking3.showBookingStatus();
	}

}
