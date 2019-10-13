package chillnGrillFoodServices;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		String array[] = {"Ajay","Sachin","Kamal","Swati","Ajay","Rahul","Amit"};
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String a:array) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		Set<Entry<String, Integer>> v = map.entrySet();
		for(Entry<String,Integer> entry:v) {
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		System.out.println("\nName of Employees of maximum number of projects");
		for(Entry<String,Integer> entry:v) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("\nName of Employees of minimum number of projects");
		for(Entry<String,Integer> entry:v) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
