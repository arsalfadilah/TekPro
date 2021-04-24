package shape;


public class Circle {
	private double radius;
	//1.	variable color : string
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	//2.	Constructor Circle(radius : double, color : string)
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//3.	Getter and setter for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() { 
		return radius*radius*Math.PI; 
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}

