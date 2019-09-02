package interfaceExcercise;

public class Trainee implements Student{
	private int marksSecured;

	public Trainee(int marksSecured) {
		this.marksSecured = marksSecured;
	}

	@Override
	public void calcPercentage() {
		// TODO Auto-generated method stub
		if(!(marksSecured>400)) {
			System.out.println("The Total aggregate percentage"
					+ " secured by the Intern is "+(((double)(marksSecured)/TOTAL_MAXIMUM_MARKS)*100));
		}
		else {
			System.out.println("Please enter the correct marks");
		}
	}
	
}
