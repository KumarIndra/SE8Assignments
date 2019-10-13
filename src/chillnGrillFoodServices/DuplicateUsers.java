package chillnGrillFoodServices;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class DuplicateUsers {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Max", "fgc123", "max@infy.com"));
		userList.add(new User("Mike", "hdgsh@", "imike@infy.com"));
		userList.add(new User("Mojo", "asdf45", "jojo@infy.com"));
		userList.add(new User("Michael", "oiort543", "imike@infy.com"));
		userList.add(new User("John", "ucantseeme", "jojo@infy.com"));
		userList.add(new User("Moby", "fgc123", "iammoby@infy.com"));
		
		Set<User> userSet = new LinkedHashSet<>();
		userSet.addAll(userList);
		for(User user : userSet)
			System.out.println(user);
	}
}
class User {
	String username;
	String password;
	String email;
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public String toString() {
		return this.username + " : " + this.email;
	}
	
	public boolean equals(Object o){
	   
	    User user = (User) o;
	    if((this.email).equals(user.email)){
	        return true;
	    }
	    return false;
	}
	
	public int hashCode() {
		int hash = 1;
		hash = 31*1+((email==null)?0:email.hashCode());
		return hash;
	}
	
	
}
