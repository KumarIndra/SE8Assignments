package exception.checkedException.excercise;

public class checkedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Applicant input = new Applicant();
		input.setApplicantName(null);
		input.setApplicantAge(19);
		input.setPostApplied("Probationary Officer");
		Validator v = new Validator();
		v.validate(input);
	}

}
