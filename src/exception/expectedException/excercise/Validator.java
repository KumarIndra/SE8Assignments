package exception.expectedException.excercise;

class InvalidNameException extends Exception{
	public InvalidNameException() {
		super("Invalid Employee Name");
	}
}
class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super("Invalid Employee Age");
	}
}
public class Validator {
	public void validate(Employee employee) throws InvalidNameException, InvalidAgeException {

		if(isValidName(employee.getName())==false) throw new InvalidNameException();{
			if(isValidAge(employee.getAge())==false) throw new InvalidAgeException();{
				System.out.println("All the values are Valid.");
			}
		 }

	}
	public boolean isValidName(String name) {
		if(name.length()>8) return true;
		else return false;
	}
	public boolean isValidAge(Integer age) {
		if(age>18 && age < 60) return true;
		else return false;
	}
}
