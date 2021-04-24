package shape;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	// A public method for retrieving the height 
	public double getHeight() { 
		return height; 
	} 
	
	// A public method for computing the volume of cylinder 
	// use superclass method getarea() to get the base area 
	// change getArea() to super.getArea() for get area of circle.
	public double getVolume() { 
		return super.getArea()*height; 
	} 
	
	//Overriding getArea() from class circle for get an area of cylinder
	public double getArea() {
		return (2*Math.PI*super.getRadius()*height) + (2*super.getArea());
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}
	
}
