package exception.expectedException.excercise;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmployeeTest {
	Employee employee = new Employee();
	Validator valid = new Validator();
	@Rule
	public ExpectedException ee = ExpectedException.none();
	
	@Test
	public void calculateYearlySalaryValidtest() {
		employee.setMonthlySalary(15000);
		employee.setAge(53);
		double actual = employee.calculateYearlySalary();
		double expected = 196200;
		assertEquals(expected, actual,0);
	}
	
	@Test
	public void validateInvalidNameTest() throws InvalidNameException, InvalidAgeException{
		
		employee.setName("John");
		employee.setAge(38);
		employee.setMonthlySalary(20000);
		ee.expect(InvalidNameException.class);
		valid.validate(employee);
		
	}
	
	@Test
	public void validateInvalidAgeTest() throws InvalidNameException, InvalidAgeException {
		employee.setName("Yuvaraj Singh");
		employee.setAge(12);
		employee.setMonthlySalary(20000);
		ee.expect(InvalidAgeException.class);
		valid.validate(employee);
		
		
	}
	
	@Test
	public void isValidNameInvalidNameTest() {
		employee.setName("John");
		employee.setAge(45);
		employee.setMonthlySalary(20000);
		assertFalse(valid.isValidName(employee.getName()));
	}
	@Test
	public void isValidNamevalidNameTest() {
		employee.setName("Yuvaraj Singh");
		employee.setAge(45);
		employee.setMonthlySalary(20000);
		assertTrue(valid.isValidName(employee.getName()));
	}
	@Test
	public void isValidAgeInvalidAgeTest() {
		employee.setName("Yuvaraj Singh");
		employee.setAge(45);
		employee.setMonthlySalary(20000);
		assertTrue(valid.isValidAge(employee.getAge()));
	}
	@Test
	public void isValidAgeValidAgeTest() {
		employee.setName("Yuvaraj Singh");
		employee.setAge(12);
		employee.setMonthlySalary(20000);
		assertFalse(valid.isValidAge(employee.getAge()));
	}
	
}