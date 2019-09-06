package assignment6;

public class ComplexNumbers {
	private double real;
	private double imaginary;
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	public ComplexNumbers(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	@Override
	public boolean equals(Object obj) {
		ComplexNumbers cn = (ComplexNumbers) obj;
		if(real == cn.real)
			if(imaginary == cn.imaginary)
				return true;
		return false;
	}
	
	@Override
	public String toString() {
		if(imaginary<0)
		return "ComplexNumber: "+real+imaginary+"i";
		else return "ComplexNumber: "+real+"+"+imaginary+"i";
	}
}
