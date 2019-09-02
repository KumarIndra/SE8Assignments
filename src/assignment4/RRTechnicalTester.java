package assignment4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class RRTechnicalTester {
	static Logger logger = Logger.getLogger(RRTechnicalTester.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("src//assignment4//log4j.xml");
		RegularCourseCertification rcc = new RegularCourseCertification("Rakesh", "J2EE", 5, 85);
		logger.info("Regular course certificaiton Object is created");
		CrashCourseCertification ccc = new CrashCourseCertification("Roshan", "Angular", 71);
		logger.info("CrashCourseCertification Object is created");
		ccc.calculateFee();
		System.out.println("Regular Course Registration Details\n*********************************");
		System.out.println("Student Name\t\t: "+rcc.getStudentName()
						+"\nCourse Name\t\t: "+rcc.getCourseName()
						+"\nCourse Duration\t\t: "+rcc.getCourseCertification()+" months"
						+"\nRegistration ID\t\t: "+rcc.getRegistrationId()
						+"\nFees\t\t\t: "+rcc.calculateFee());
		System.out.println("Crash Course Registration Details\n*********************************");
		System.out.println("Student Name\t\t: "+ccc.getStudentName()
		+"\nCourse Name\t\t: "+ccc.getCourseName()
		+"\nCourse Duration\t\t: 2 months"
		+"\nRegistration ID\t\t: "+ccc.getRegistrationId()
		+"\nFees\t\t\t: "+ccc.calculateFee());
		
	}

}
