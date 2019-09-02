package exception.uncheckedException.excercise;

public class Calculator{
	
		    int add(String op1, String op2) throws NumberFormatException{
		    	try {
		        Integer i1 = Integer.parseInt(op1);
		        Integer i2 = Integer.parseInt(op2);
		        return i1+i2;
		    	}
		    	catch(NumberFormatException e) {
		    		System.out.println("Only Numbers allowed in addMethod");
		    		throw e;
		    	}
		    }

		    int subtract(String op1, String op2) throws NumberFormatException{
		    	try {
		        Integer i1 = Integer.parseInt(op1);
		        Integer i2 = Integer.parseInt(op2);
		        return i1-i2;
		    	}
		    	catch(NumberFormatException e) {
		    		System.out.println("Only Numbers allowed in SubtractMethod");
		    		throw e;
		    	}
		    }
		    int multiply(String op1, String op2) throws NumberFormatException{
		    	try {
		        Integer i1 = Integer.parseInt(op1);
		        Integer i2 = Integer.parseInt(op2);
		        return i1*i2;
		    	}
		    	catch(NumberFormatException e) {
		    		System.out.println("Only Numbers allowed in MultiplyMethod");
		    		throw e;
		    	}
		    }
		    
		    int divide(String op1, String op2) throws NumberFormatException,ArithmeticException{
		    	try {
		    		Integer i1 = Integer.parseInt(op1);
			        Integer i2 = Integer.parseInt(op2);
			        return i1/i2;
		    	}
		    	catch(NumberFormatException e) {
		    		System.out.println("Only Numbers allowed in divideMethod");
		    		throw e;
		    	}
		    	catch(ArithmeticException e){
		    		System.out.println("Divide by zero not applicable in divideMethod");
		    		throw e;
		    	}
		    	
		        
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
try {
		System.out.println(calc.add("5", "6"));
		System.out.println(calc.subtract("5", "3")+"\n"+calc.multiply("2", "2")+"\n"+calc.divide("s", "0"));
}
catch(NumberFormatException |ArithmeticException e) {
	System.out.println(e.getMessage());
}
		
		
	}

}
