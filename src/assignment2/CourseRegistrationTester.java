package assignment2;

public class CourseRegistrationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseRegistration input1 = new CourseRegistration();
		input1.setStudentName("Peter");
		input1.setRegistrationId(5001);
		input1.setQualifyingMarks(78);
		input1.setCourseId(1005);
		input1.setHostelRequired(false);
		input1.calculateCourseFee();
	}

}
