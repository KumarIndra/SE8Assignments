package assignment2;

public class CourseRegistration {
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private double fee;
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	private int courseId;
	private boolean hostelRequired;
	private double discount;
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	
	public boolean validateMarks() {
		if(getQualifyingMarks()>=65 && getQualifyingMarks()<=69) {
			setDiscount(5);
			return true;
		}else if(getQualifyingMarks()>=70 && getQualifyingMarks()<=84) {
			setDiscount(10);
			return true;
		}else if(getQualifyingMarks()>=85) {
			setDiscount(15);
			return true;
		}
		return false;
		
	}
	public boolean validateCourseId() {
		switch(getCourseId()) {
		case 1001:{
			setFee(55000);
			return true;
		}
		case 1002:{
			setFee(35675);
			return true;
		}
		case 1003:{
			setFee(28300);
			return true;
		}
		case 1004:{
			setFee(22350);
			return true;
		}
		case 1005:{
			setFee(115000);
			return true;
		}
		default:
			return false;
		}
	}
	public void calculateCourseFee() {
		if(validateMarks()) {
			if(validateCourseId()) {
				setCourseFee(getFee()-(getFee()*(getDiscount()/100)));
				System.out.println("*****************Course Allocation Details********************");
				System.out.println("Student Name\t\t\t:"+getStudentName());
				System.out.println("Course Id\t\t\t:"+getCourseId());
				System.out.println("Qualifying Exam Marks\t\t:"+getQualifyingMarks());
				System.out.println("Student's Registration Id\t:"+getRegistrationId());
				System.out.println("Total Course Fee\t\t:"+getCourseFee());
				if(isHostelRequired()) {
					System.out.println("Hostel Required\t\t\t: Yes");
				}else {
					System.out.println("Hostel Required\t\t\t: No");
				}
				
			}
			else {
				System.out.println("Invalid Course Id. Please try again!!!");
			}
		}else {
			System.out.println("Mark is less than 65. You are not eligible for admission");
		}
	}
}
