package SoudagarTravelsExcercise;

public class Traveller {
	private String name;
	private String id;
	private double fare;
	
	
	public Traveller(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	public void calculateFare() {
		setFare(2000+(2000*(11.36/100)));
	}
	
	public void displayDetails() {
		System.out.println("Traveller Details\n********************");
		System.out.println("Traveller name\t:"+getName());
		System.out.println("Traveller Id\t:"+getId());
		calculateFare();
		System.out.println("Cost of travel\t:"+getFare());
	}
	
}
