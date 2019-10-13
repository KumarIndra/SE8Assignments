package chillnGrillFoodServices.enumExercise;

public class Student {
	private int studentId;
	private String name;
	private int totalMarks;
	private Grade grade;
	private float scholarshipAmount;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScholarshipAmount() {
		return scholarshipAmount;
	}
	public void setScholarshipAmount(float scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	
	public void calculateGrade() {
		if(getTotalMarks()>=250) {
			this.setGrade(grade.A);
		}else if(getTotalMarks()>=200 && getTotalMarks()<250) {
			this.setGrade(grade.B);
		}else if(getTotalMarks()>=175 && getTotalMarks()<200) {
			this.setGrade(grade.C);
		}else if(getTotalMarks()>=150 && getTotalMarks()<175) {
			this.setGrade(grade.D);
		}else {
			this.setGrade(grade.E);
		}
	}
	public  void calculateScholarshipAmount() {
		switch(getGrade()) {
		case A:{
			this.setScholarshipAmount(5000);
			break;} 
		case B:{
			this.setScholarshipAmount(4000f);
			break;
		}
		case C:{
			this.setScholarshipAmount(3000.0f);
			break;
		}
		case D:{
			this.setScholarshipAmount(2000.0f);
			break;
		}
		case E:{
			this.setScholarshipAmount(0);
			break;
		}
		}
		
	}
}
