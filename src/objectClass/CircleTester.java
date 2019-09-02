package objectClass;

public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10.0f);
		Circle c2 = new Circle(11.0f);
		
		if(c1.equals(c2)) {
			System.out.println("The two circles are equal");
			System.out.println(c1);
		}else {
			System.out.println("The two circles are not equal\n" + 
					"");
		}
		
	}

}
