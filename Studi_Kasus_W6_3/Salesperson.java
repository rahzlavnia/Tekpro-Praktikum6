
public class Salesperson implements Comparable{
	private String firstName, lastName;
	private int totalSales;

	//------------------------------------------------------------
	//	Constructor: Sets up the sales person object with
	//				 the given data.
	//------------------------------------------------------------
	public Salesperson (String first, String last, int sales) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	
	//------------------------------------------------------------
	//	Returns the sales person as a string.
	//------------------------------------------------------------
	public String toString() {
		return lastName + ", " + firstName + "\t: " + totalSales;
	}
	
	//------------------------------------------------------------
	//	Returns true if the sales people have
	//	the same name.
	//------------------------------------------------------------
	public boolean equals (Object other) {
		return (lastName.equals(((Salesperson)other).getLastName())&&
				firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	//------------------------------------------------------------
	//	Order is based on total sales with the name
	//	(last, then first) breaking a tie.
	//------------------------------------------------------------
	 public int compareTo(Object other){
	    int result;
	    Salesperson obj = (Salesperson) other;
	    
	    if(this.totalSales < obj.totalSales) {
	    	result = -1;
	    }else if(this.totalSales > obj.totalSales) {
	    	result = 1;
	    }else  {
	    	int k = this.firstName.compareTo(obj.firstName);
	    	if(k != 0) {
	    		result = k;
	    	} else {
	    		result = this.lastName.compareTo(obj.lastName);
	    	}
	    }
	    	return result;
	 }
	
	//--------------------------
	//	First name accessor.
	//--------------------------
	public String getFirstName() {
		return firstName;
	}
	
	//--------------------------
	//	Last name accessor.
	//--------------------------
	public String getLastName() {
		return lastName;
	}
	
	//--------------------------
	//	Total sales accessor.
	//--------------------------
	public int getSales() {
		return totalSales;
	}

}
