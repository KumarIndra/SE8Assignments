package aggregationExcercise;

public class RRAccountTester {
	public static void main(String[] args) {
		Address address = new Address("No. 123","9th Cross, Trinethra circle","Mysuru","Karnataka",700177);
		RRAccount input = new RRAccount("Rakesh", address, 50000.0);
		if(input.isValidAddress()) {
			System.out.println("**************Customer Details*****************");
			System.out.println("Customer Name\t\t:"+input.getCustomerName());
			System.out.println("Address\t\t:"+address.getFirstLine()+", "
					+address.getSecondLine()+", "+address.getCity()+", "+address.getState()
					+", "+address.getPincode());
			System.out.println("Deposit Amount\t\t:"+input.getDepositAmount());
			System.out.println("Congratulations!! Your account has been Created.");
		}else {
			System.out.println("The Pincode entered by You is Invalid!!!");
		}
	}
}
