
public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	//---------------------------------------
	//	Constructor: Sets up the Rectangle.
	//---------------------------------------
	public Rectangle (double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	//---------------------------------------
	//	Returns the surface area of the Rectangle
	//---------------------------------------
	public double area() {
		return length*width;
	}
	
	//---------------------------------------
	// Returns the Rectangle as a String.
	//---------------------------------------
	public String toString() {
		return super.toString() + " of lentgh = " + length 
				+ " of width = " + width;
	}
}

