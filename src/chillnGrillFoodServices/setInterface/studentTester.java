package chillnGrillFoodServices.setInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class studentTester {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(101,"Ron",1));
		students.add(new Student(102,"Angela",9));
		students.add(new Student(103,"Hazel",5));
		students.add(new Student(104,"David",3));
		students.add(new Student(105,"Alan",4));
		students.add(new Student(103,"Hazel",5));
		students.add(new Student(101,"Ron",1));
		
		TreeSet<Student> studentsets = new TreeSet<Student>();
		studentsets.addAll(students);
		
		System.out.println("List of students who applied for Re-evaluation:");
		for(Student s:studentsets) {
			System.out.println("\nStudent Id: "+s.getStudentId());
			System.out.println("Name: "+s.getStudentName());
			System.out.println("Semester: "+s.getStudentSemester());
		}
		
		
		
		System.out.println("\nList of students who applied for Re-evaluation in more than one subject:");
		HashSet<String> studentset = new HashSet<>();
		HashSet<Student> studentduplicate = new HashSet<>();
		
		for(Student s:students) {
			if(!studentset.add(s.getStudentName())) {
				studentduplicate.add(s);
			}
		}
		for(Student s:studentduplicate) {
			System.out.println("\nName: "+s.getStudentName());
		}
	}
	
	
}
