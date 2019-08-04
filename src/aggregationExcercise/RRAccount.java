package aggregationExcercise;

public class RRAccount {
	private String customerName;
	private Address address;
	private double depositAmount;
	
	
	public RRAccount(String customerName, Address address, double depositAmount) {
		this.customerName = customerName;
		this.address = address;
		this.depositAmount = depositAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	public boolean isValidAddress() {
		if(address.getPincode()<=999999 && address.getPincode()>=100000){
			return true;
		}else {
			return false;
		}
	}
	
}
