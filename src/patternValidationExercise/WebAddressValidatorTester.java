package patternValidationExercise;

public class WebAddressValidatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebAddressValidator webAddress = new WebAddressValidator();
		if(webAddress.isValidWebAddress("http://www.infosys.com")) {
			System.out.println("You have entered a valid web address");
		}else {
			System.out.println("You have entered an invalid web address");
		}
		if(webAddress.isValidWebAddress("http.www.infosys.au")) {
			System.out.println("You have entered a valid web address");
		}else {
			System.out.println("You have entered an invalid web address");
		} 
	}

}
