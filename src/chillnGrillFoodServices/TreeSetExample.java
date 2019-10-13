package chillnGrillFoodServices;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class TreeSetExample {
	
	public static void main(String[] args) {
		Trainee trainee1 = new Trainee();
		trainee1.setEmpId(104);
		trainee1.setName("James");
		
		Trainee trainee2 = new Trainee();
		trainee2.setEmpId(102);
		trainee2.setName("Sirius");
		
		Trainee trainee3 = new Trainee();
		trainee3.setEmpId(103);
		trainee3.setName("Peter");
		
		Trainee trainee4 = new Trainee();
		trainee4.setEmpId(101);
		trainee4.setName("Remus");
		
		Trainee trainee5 = new Trainee();
		trainee5.setEmpId(100);
		trainee5.setName("Lily");
		
		Trainee trainee6 = new Trainee();
		trainee6.setEmpId(104);
		trainee6.setName("James");
		
		TreeSet<Trainee> traineeSet = new TreeSet<Trainee>();
		traineeSet.add(trainee1);
		traineeSet.add(trainee2);
		traineeSet.add(trainee3);
		traineeSet.add(trainee4);
		traineeSet.add(trainee5);		
		System.out.println("Trainee Size:"+traineeSet.size());
		
		traineeSet.add(trainee6);		
		//Trainee6 is a copy of Trainee1 hence won't be added.
		System.out.println("Trainee Size:"+traineeSet.size());
		
		for (Trainee trainee : traineeSet) {
			System.out.println(trainee.getName());
		}
	}
}

class Trainee implements Comparable<Trainee>{
	
	public Integer empId;
	public String name;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Trainee trainee) {
		if(trainee.getEmpId()>this.getEmpId())
			return -1;
		else if(trainee.getEmpId().equals(this.empId))
			return 0;
		else
			return 1;
	}
} 
 

