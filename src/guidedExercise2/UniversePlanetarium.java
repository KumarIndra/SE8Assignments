package guidedExercise2;

public class UniversePlanetarium {
	public double baseFare = 100.0;
	public int seatsAvailable = 250;
	public double getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	public void bookSeat(String name,int noOfSeats) {
		if(noOfSeats <= seatsAvailable) {
			System.out.println(name+" has successfully booked "+noOfSeats+
					" seats, total fare is "+(noOfSeats*baseFare)+" and "+(seatsAvailable-noOfSeats)+" seats remaining");
		}
		else {
			System.out.println("Sorry "+name+"! insufficient number of seats");
		}
	}
}
