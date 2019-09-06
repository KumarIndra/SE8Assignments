package assignment6;

public class ComplexNumberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumbers cn1 = new ComplexNumbers(2.0, -10.0);
		ComplexNumbers cn2 = new ComplexNumbers(-2.0, -10.0);
		
		if(cn1.equals(cn2)) {
			System.out.println("The Two ComplexNumbers are Equal\nThe Two numbers are\n");
			System.out.println(cn1+"\n"+cn2);
		}else {
			System.out.println("The Two ComplexNumbers are not Equal\nThe Two numbers are\n");
			System.out.println(cn1+"\n"+cn2);
		}
	}

}
