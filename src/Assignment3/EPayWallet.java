package Assignment3;


public class EPayWallet {
	public static void processPaymentByUser(User user,double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congratulations "+user.getUserName()
			+" Payment of "+billAmount+" was Successfull");
			System.out.println("Your Wallet balance is "+user.getWalletbalance());
		}
		else {
			System.out.println("Sorry "+user.getUserName()
			+", not enough Balance to make a Payment");
			System.out.println("Your Wallet balance is "+user.getWalletbalance());
		}
		if (user instanceof KYCUser) {
			KYCUser new_name = (KYCUser) user;
			System.out.println("You have "+new_name.getRewardpoints()+" reward points");
		}
	}
}
