package assignment7;

public class Dog 
implements Comparable<Dog>
{
	private String breed;
	private Integer ageInMonths;
	
	
	public Dog(String breed, Integer ageInMonths) {
		super();
		this.breed = breed;
		this.ageInMonths = ageInMonths;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getAgeInMonths() {
		return ageInMonths;
	}
	public void setAgeInMonths(Integer ageInMonths) {
		this.ageInMonths = ageInMonths;
	}
	@Override
	public int compareTo(Dog o) {
		if(o.getAgeInMonths()>this.getAgeInMonths() && o.getBreed().equals(this.getBreed())) {
			return -1;
		}else if(o.getAgeInMonths()==this.getAgeInMonths() && o.getBreed().equals(this.getBreed())) {
			return 0;
		}else	
			return 1;
	}
	
	
//	public boolean equals(Object obj) {
//		Dog o = (Dog) obj;
//		if(this.getBreed().equals(o.getBreed()) && this.getAgeInMonths().equals(o.getAgeInMonths())) {
//			return true;
//		}else return false;
//	}
//	
//	public int hashCode() {
//		int hash = 1;
//		int hash1,hash2;
//		hash1 = 31 * hash + (this.getBreed()==null?0:getBreed().hashCode());
//		hash2 = 31 * hash + (this.getAgeInMonths()==null?0:getAgeInMonths().hashCode());
//		return hash1+hash2;
//	}

	
}
