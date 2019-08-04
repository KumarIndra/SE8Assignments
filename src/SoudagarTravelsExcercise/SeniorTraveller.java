package SoudagarTravelsExcercise;

public class SeniorTraveller extends Traveller{
	private int age;
	
	

	public SeniorTraveller(String name, String id,int age) {
		super(name, id);
		this.age = age;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void calculateFare() {
		double discountedFare;
			if(getAge()>=50 && getAge()<=65) {
				discountedFare = 2000-(2000*(10.0/100));
				super.setFare(discountedFare+(discountedFare*(11.36/100)));
			}else if(getAge()>65) {
				discountedFare =2000-(2000*(15.0/100));
				super.setFare(discountedFare+(discountedFare*(11.36/100)));
			}else if(getAge()<50) {
		
				super.setFare(-1);
			}
		}
	
	@Override	
	public void displayDetails() {
		calculateFare();
		if(getFare()>=0) {
			System.out.println("Traveller Details\n********************");
			System.out.println("Traveller name\t:"+getName());
			System.out.println("Traveller Id\t:"+getId());
			System.out.println("Cost of travel\t:"+getFare());
		}else {
			System.out.println("\nSorry "+getName()+", age should be 50 or more"
					+ " to avail senior traveller's concession.");
		}
	}
}
