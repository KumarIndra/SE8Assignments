package workingWithString;

public class Customer {
	private String customerName;
	private int applicableDiscount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplicableDiscount() {
		return applicableDiscount;
	}
	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}
	
	public void findDiscountAndName(String inputString) {
		String arr[] = inputString.split(":");
		String type = arr[0];
		String name = arr[1];
		if(type.equalsIgnoreCase("regular")) {
			setApplicableDiscount(10);
			setCustomerName(name);
			System.out.println("Hi "+name+"! "+applicableDiscount+"% discount is applicable for you");
		}else if(type.equalsIgnoreCase("privileged")) {
			setApplicableDiscount(20);
			System.out.println("Hi "+name+"! "+applicableDiscount+"% discount is applicable for you");
		}
			
	}
}	
