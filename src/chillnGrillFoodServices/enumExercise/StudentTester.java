package chillnGrillFoodServices.enumExercise;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("Alvin");
		student.setStudentId(1000);
		student.setTotalMarks(280);
		student.calculateGrade();
		student.calculateScholarshipAmount();
		System.out.println("Student Details:\n"
				+ "********************"
				+ "\nStudent Id: "+student.getStudentId()
				+ "\nName :"+student.getName()
				+ "\nGrade :"+student.getGrade()
				+ "\nSchorlarship Amount :"+student.getScholarshipAmount());
		
	}

}
