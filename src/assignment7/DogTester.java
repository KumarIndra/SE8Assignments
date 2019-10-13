package assignment7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class DogTester {
	static List<Dog> dog = new ArrayList<>();
	public static void main(String[] args) {
		
		dog.add(new Dog("Companion",10));
		dog.add(new Dog("Herding",4));
		dog.add(new Dog("Terrier",15));
		dog.add(new Dog("Companion",7));
		dog.add(new Dog("Terrier",15));
		dog.add(new Dog("Terrier",9));
		dog.add(new Dog("Herding",10));
		dog.add(new Dog("Herding",10));
		
//		HashSet<Dog> doghash = new HashSet<>();
//		doghash.addAll(dog);
////		for(Dog d:doghash) {
////			System.out.println(d.getBreed()+" - Age : "+d.getAgeInMonths());
////		}
//		
		
		TreeMap<Dog, Integer> map = getDogStatistics(dog);
	
		Set<Entry<Dog, Integer>> v = map.entrySet();
		for(Entry<Dog,Integer> entry:v) {
			System.out.println(entry.getKey().getBreed()+" - Age :"+entry.getKey().getAgeInMonths()+" months - Count :"+
					entry.getValue());
		}
		
	}
	public static TreeMap<Dog, Integer> getDogStatistics(List<Dog> doghash){
		TreeMap<Dog, Integer> map = new TreeMap<>();
		for(Dog d:doghash) {
//			System.out.println(d);
			if(map.containsKey(d)) {
				
				map.put(d, map.get(d)+1);
			}else {
				
				map.put(d, 1);
			}	
			
			}
		return map;
	}

}
