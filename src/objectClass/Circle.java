package objectClass;

public class Circle {
	final static float PI = 3.14f;
	private float radius;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public Circle() {
		Circle circle = new Circle();
	}
	public Circle(float radius) {
		setRadius(radius);
	}
	public float calculateArea() {
		return PI*(radius*radius);
	}
	
	@Override
	public boolean equals(Object o) {
		Circle circle = (Circle) o;
		if(radius == circle.getRadius()) return true;
			else return false;
	}
	@Override
	public int hashCode() {
		int code = 0;
		return code;
	}
	public String toString() {
		return "The radius is "+getRadius()+" and the area is "+calculateArea();
	}
}
