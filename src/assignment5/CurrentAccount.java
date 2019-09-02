package assignment5;

import org.apache.log4j.Logger;

public class CurrentAccount extends Account{
	private int overDraftAmount;
	static Logger log = Logger.getLogger(CurrentAccount.class);
	public int getOverDraftAmount() {
		return overDraftAmount;
	}

	public void setOverDraftAmount(int overDraftAmount) {
		this.overDraftAmount = overDraftAmount;
	}
	
	public CurrentAccount(Customer customer,int overDraftAmount,int accountNo,double balance) {
		super.setCustomer(customer);
		super.setAccountNo(accountNo);
		this.overDraftAmount = overDraftAmount;
		super.setBalance(overDraftAmount+balance);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		try {
		if((getBalance()-amount)>(-1000)) {
			setBalance((getBalance()-amount));
			log.info("Available balance after withdraw: "+getBalance());
		}else {
			setBalance((getBalance()-amount));
			throw new Exception();
		}
		}
		catch(Exception e) {
			log.error("INSUFFICIENT_BALANCE");
			log.info("You cannot withdraw this amount. Not enough balance!\n");
		}
	}
	
}
