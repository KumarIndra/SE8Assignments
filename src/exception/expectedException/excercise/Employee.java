package exception.expectedException.excercise;

public class Employee {
	private String name;
	private double monthlySalary;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public double calculateYearlySalary() {
		double annualSalary = 0;
		if(age>18 && age<=50) {
			annualSalary = (monthlySalary+(monthlySalary*(8.0/100)))*12;
		}else if(age>50 && age<60) {
			annualSalary = (monthlySalary+(monthlySalary*(9.0/100)))*12;
		}
		return annualSalary;
	}
}
