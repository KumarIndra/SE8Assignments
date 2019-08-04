package Assignment3;

public class UserTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(101,"Jack","Jack@infy.com",1000);
		KYCUser user2 = new KYCUser(201,"Jill","Jill@infy.com",3000);
		EPayWallet.processPaymentByUser(user1, 700);
		EPayWallet.processPaymentByUser(user2, 1500);
		EPayWallet.processPaymentByUser(user2, 800);
		EPayWallet.processPaymentByUser(user2, 1200);
	}

}
