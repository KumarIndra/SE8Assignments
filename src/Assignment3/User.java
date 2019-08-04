package Assignment3;

public class User {
	private int id;
	private String userName;
	private String email;
	private double walletbalance;
	public User(int id, String userName, String email, double walletbalance) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.walletbalance = walletbalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletbalance() {
		return walletbalance;
	}
	public void setWalletbalance(double walletbalance) {
		this.walletbalance = walletbalance;
	}
	
	public boolean makePayment(double billamount) {
		if(billamount<=getWalletbalance()) {
			setWalletbalance(getWalletbalance()-billamount);
			return true;
		}else {
			return false;
		}
	}
}
