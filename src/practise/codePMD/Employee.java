package practise.codePMD;

import java.util.*;
				
					public class Employee {
						private String Name;
						public int EmpId;
					public String city;
				
						Employee() {
							this.city = "Mysore";
						}
						Employee(int empId) {
						this.EmpId = empId;}
					public String getname() {
						System.out.println("Name: " + this.Name);
						return Name;
						}
					public void setname(String name) {
					this.Name = name;
					}
						}
