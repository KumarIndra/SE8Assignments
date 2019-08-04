package guidedExercise1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = 5;
		double c = 2;
		double x,y=0;
		double output = (b*b)-(4*a*c);
		System.out.println(output);
		if(output == 0) {
			x = y = -b/(2*a);
			System.out.println("The Roots are equal x is "+x+" y is "+y);
		}else if(output < 0) {
			x = -b/(2*a);
			y = -b + Math.sqrt(-output)/(2*a);
			System.out.println("The Roots are not equal x is "+x+" y is "+y);
		}else {
			x = (-b + Math.sqrt(output))/(2*a);
			y = (-b - Math.sqrt(output))/(2*a);
			System.out.println("The Roots are x is "+x+" y is "+y);
		}
	}

}
