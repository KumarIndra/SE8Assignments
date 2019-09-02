package assignment4;

public class CrashCourseCertification extends RRTechnicalCertification{

	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		// TODO Auto-generated constructor stub
		RRTechnicalCertification.counter++;
		generateRegistrationId();
	}

	@Override
	public void generateRegistrationId() {
		// TODO Auto-generated method stub
		if((RRTechnicalCertification.counter%2)==0) {
			super.setRegistrationId(RRTechnicalCertification.counter);
		}else {
			RRTechnicalCertification.counter++;
			super.setRegistrationId(RRTechnicalCertification.counter);
		}
	}

	@Override
	public double calculateFee() {
		double discount = 0;
		double rate = CRASH_COURSE_FEE;
		if(getAdmissionTestMarks()>=90) {
			discount = rate-rate*(10.0/100);
		}else if(getAdmissionTestMarks()>=75 && getAdmissionTestMarks()<=89) {
			discount = rate-rate*(5.0/100);
		}else {
			discount = rate;
		}
		return (discount+(discount*(12.36/100)));	}

}
