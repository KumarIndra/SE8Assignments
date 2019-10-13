package chillnGrillFoodServices.setInterface;

public class Student implements Comparable<Student>{
	private Integer studentId;
	private String studentName;
	private Integer studentSemester;
	
	public Student(Integer studentId, String studentName, Integer studentSemester) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSemester = studentSemester;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(Integer studentSemester) {
		this.studentSemester = studentSemester;
	}
	
	@Override
	public int compareTo(Student student) {
		if((student.getStudentSemester())>(this.getStudentSemester())) {
			return -1;
		}else if((student.getStudentSemester()).equals(this.studentSemester)) {
			return 0;
		}else return 1;
	}
	
	//use when duplicate must remove
//	public boolean equals(Object o) {
//		Student student = (Student) o;
//		if((this.studentId).equals(student.getStudentId())) {
//			return true;
//		}else return false;
//	}
	
//	public int hashCode() {
//		int hash = 1;
//		hash = 31 * hash + ((this.studentId==null)?0:this.studentId.hashCode());
//		return hash;
//	}
	
}
