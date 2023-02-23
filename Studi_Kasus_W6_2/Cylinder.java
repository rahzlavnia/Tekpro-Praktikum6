
public class Cylinder extends Shape{
	
	private double radius;
	private double heigth;
	
	//---------------------------------------
	//	Constructor: Sets up the Cylinder.
	//---------------------------------------
	public Cylinder (double radius, double heigth) {
		super("Cylinder");
		this.radius = radius;
		this.heigth = heigth;
	}
	
	//---------------------------------------
	//	Returns the surface area of the Cylinder
	//---------------------------------------
	public double area() {
		return Math.PI*radius*radius*heigth;
	}
	
	//---------------------------------------
	// Returns the Cylinder as a String.
	//---------------------------------------
	public String toString() {
		return super.toString() + " of radius = " + radius 
				+ " of heigth = " + heigth;
	}
}

