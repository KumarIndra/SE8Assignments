package exception.checkedException.excercise;

class InvalidNameException extends Exception
{
	public InvalidNameException() {
		super("Invalid Applicant Name");
	}
}
class InvalidPostException extends Exception
{
	public InvalidPostException() {
		super("Invalid Post");
	}
}
class InvalidAgeException extends Exception
{
	public InvalidAgeException() {
		super("Invalid Applicant Age");
	}
}
public class Validator {
	public void validate(Applicant applicant) {
		try {
			if(isValidName(applicant.getApplicantName())==false) throw new InvalidNameException();{
				System.out.println("Name Valid");
				if(isValidAge(applicant.getApplicantAge())==false) throw new InvalidAgeException();{
					System.out.println("Age Valid");
					if(isValidPost(applicant.getPostApplied())==false) throw new InvalidPostException();{
						System.out.println("Post Valid");
						System.out.println("All the values are valid");
					}
				}
			}
				
			
				
		}
		catch(InvalidNameException e1) {
			System.out.println(e1.getMessage());
		}
		catch(InvalidAgeException e2) {
			System.out.println(e2.getMessage());
		}
		catch(InvalidPostException e3) {
			System.out.println(e3.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public boolean isValidName(String name) {
		if(name!="" && name!=null) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isValidAge(int age) {
		if(age>18 && age<35) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isValidPost(String post) {
		if(post.equalsIgnoreCase("Probationary Officer") || post.equalsIgnoreCase("Assistant") || post.equalsIgnoreCase("Special Cadre Officer")) {
			return true;
		}else {
			return false;
		}
	}
}
