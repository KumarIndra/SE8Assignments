package assignment5;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class InfyBankTester {
	static Logger log = Logger.getLogger(InfyBankTester.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		Customer customer1 = new Customer();
		customer1.setCustomerId(1001);
		customer1.setName("John");
		
		SavingsAccount sa1 = new SavingsAccount(101, 500, 12, customer1, 1000);
		log.info("For "+sa1.getCustomer().getName());
		log.info("Account Balance :"+sa1.getBalance());
		log.info("Interest: "+sa1.calculateInterest());
		sa1.withdraw(1600);
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(1002);
		customer2.setName("Jenny");
		
		CurrentAccount ca1 = new CurrentAccount(customer2, 500, 102, 2000);
		ca1.deposit(1500);
		System.out.println("For "+ca1.getCustomer().getName());
		System.out.println("Account Balance :"+ca1.getBalance());
		ca1.withdraw(4000);
		System.out.println("Available balance after withdraw: "+ca1.getBalance());
		ca1.withdraw(1500);
	}

}
