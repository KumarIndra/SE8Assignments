package interfaceExcercise;

public class Intern implements Student{
	private int marksSecured;
	private int projectMarks;
	public Intern(int marksSecured, int projectMarks) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	@Override
	public void calcPercentage() {
		// TODO Auto-generated method stub
		if(!(marksSecured>400)) {
			System.out.println("The Total aggregate percentage"
					+ " secured by the Intern is "+(((double)(marksSecured+projectMarks)/TOTAL_MAXIMUM_MARKS)*100));
		}
		else {
			System.out.println("Please enter the correct marks");
		}
	}
	
	
}
