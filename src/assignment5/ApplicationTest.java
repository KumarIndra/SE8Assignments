package assignment5;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
	static Logger log = Logger.getLogger(ApplicationTest.class);
	@Test
	public void invalidCurrentWithdraw() {
		Customer customer2 = new Customer();
		customer2.setCustomerId(1002);
		customer2.setName("Jenny");
		
		CurrentAccount ca1 = new CurrentAccount(customer2, 500, 102, 2000);
		System.out.println("For "+ca1.getCustomer().getName());
		ca1.withdraw(3501);
		Assert.assertTrue(ca1.getBalance()>(-1000));
	}
	@Test
	public void validCurrentWithdraw() {
		Customer customer2 = new Customer();
		customer2.setCustomerId(1002);
		customer2.setName("Jenny");
		
		CurrentAccount ca1 = new CurrentAccount(customer2, 1000, 102, 2000);
		System.out.println("For "+ca1.getCustomer().getName());
		ca1.withdraw(3501);
		Assert.assertTrue(ca1.getBalance()>(-1000));
	}
	@Test
	public void invalidSavingsWithdraw() {
		BasicConfigurator.configure();
		Customer customer1 = new Customer();
		customer1.setCustomerId(1001);
		customer1.setName("John");
		SavingsAccount sa1 = new SavingsAccount(101, 500, 12, customer1, 1000);
		sa1.withdraw(900);
		Assert.assertTrue(sa1.getBalance()>sa1.getMinimumBalance());
	}
	@Test
	public void validSavingsWithdraw() {
		BasicConfigurator.configure();
		Customer customer1 = new Customer();
		customer1.setCustomerId(1001);
		customer1.setName("John");
		SavingsAccount sa1 = new SavingsAccount(101, 500, 12, customer1, 1000);
		sa1.withdraw(400);
		Assert.assertTrue(sa1.getBalance()>sa1.getMinimumBalance());
	}
}
