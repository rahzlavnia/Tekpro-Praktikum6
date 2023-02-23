
abstract class Shape {
	String shapeName;
	
	public Shape(String sn){
		shapeName = sn;
	}
	
	public abstract double area();
	
	public String toString() {
		  return "A Shapes with [shape of " + shapeName + "]";
	}
}	

