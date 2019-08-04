package Assignment3;

public class KYCUser extends User{
	private int rewardpoints;

	public KYCUser(int id, String userName, String email, double walletbalance) {
		super(id,userName,email,walletbalance);
	}

	public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

	@Override
	public boolean makePayment(double billamount) {
		if(super.makePayment(billamount)) {
			setRewardpoints(getRewardpoints()+(int)(billamount*(10.0/100)));
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
