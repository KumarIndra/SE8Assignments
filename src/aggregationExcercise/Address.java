package aggregationExcercise;

public class Address {
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private int pincode;
	
	public Address(String firstLine, String secondLine, String city, String state, int pincode) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	public String getSecondLine() {
		return secondLine;
	}
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
