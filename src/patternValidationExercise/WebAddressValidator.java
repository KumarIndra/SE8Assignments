package patternValidationExercise;

public class WebAddressValidator {
	public boolean isValidWebAddress(String webAddress){
		if(webAddress.matches("(http|https)(://)(www.)?[\\w]*[.](com|org|net)")) return true;
		else return false;
	}
}
