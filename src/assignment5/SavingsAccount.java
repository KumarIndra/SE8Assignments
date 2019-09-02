package assignment5;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SavingsAccount extends Account{
	static Logger log = Logger.getLogger(SavingsAccount.class);
	private double minimumBalance;
	private int interestRate;
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public SavingsAccount(int accountNo,double minimumBalance, int interestRate,Customer customer,double balance) {
		super.setAccountNo(accountNo);
		super.setCustomer(customer);
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;
		super.setBalance(balance);
	}
	
	@Override
	public void withdraw(double amount){
		// TODO Auto-generated method stub
		try {
			if(getBalance()-amount>minimumBalance) {
				setBalance(getBalance()-amount);
				log.info("Available balance after withdraw: "+getBalance());
			}else {
				setBalance(getBalance()-amount);
				throw new Exception();
			}
		}
		catch(Exception e) {
			log.error("INSUFFICIENT_BALANCE");
			log.info("You cannot withdraw this amount. Not enough balance!\n");
		}
	}
	
	public double calculateInterest() {
		
		return getBalance()*(interestRate/100.0);
		
	}
	
	
}
