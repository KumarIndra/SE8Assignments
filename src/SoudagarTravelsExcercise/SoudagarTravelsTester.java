package SoudagarTravelsExcercise;

public class SoudagarTravelsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller input = new Traveller("Priya", "AQW1344321");
		SeniorTraveller sinput1 = new SeniorTraveller("Joey", "PJAMG7755TY", 70);
		SeniorTraveller sinput2 = new SeniorTraveller("Raj", "876957683546", 48);
		
		showTravellerDetails(input);
		showTravellerDetails(sinput1);
		showTravellerDetails(sinput2);
	}
	
	public static void showTravellerDetails(Traveller traveller) {
		traveller.displayDetails();
	}

}
