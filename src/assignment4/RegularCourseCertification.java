package assignment4;
public class RegularCourseCertification extends RRTechnicalCertification {
	public RegularCourseCertification(String studentName, String courseName,int courseDuration
			,int admissionTestMarks) {
		// TODO Auto-generated constructor stub
		super(courseName, courseName, admissionTestMarks);
		this.courseCertification = courseDuration;
		RRTechnicalCertification.counter++;
		generateRegistrationId();
	}

	public int getCourseCertification() {
		return courseCertification;
	}

	public void setCourseCertification(int courseCertification) {
		this.courseCertification = courseCertification;
	}

	private int courseCertification;

	@Override
	public void generateRegistrationId() {
		// TODO Auto-generated method stub
		if((RRTechnicalCertification.counter%2)==1) {
			super.setRegistrationId(RRTechnicalCertification.counter);
		}else {
			RRTechnicalCertification.counter++;
			super.setRegistrationId(RRTechnicalCertification.counter);
		}
		
	}

	@Override
	public double calculateFee() {
		// TODO Auto-generated method stub
		double discount = 0;
		double rate = REGULAR_COURSE_FEE*getCourseCertification();
		if(getAdmissionTestMarks()>=90) {
			discount = rate-rate*(10.0/100);
		}else if(getAdmissionTestMarks()>=75 && getAdmissionTestMarks()<=89) {
			discount = rate-rate*(5.0/100);
		}else {
			discount = rate;
		}
		return (discount);
	}
	
}
