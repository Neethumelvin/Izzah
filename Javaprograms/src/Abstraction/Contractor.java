package Abstraction;

public class Contractor extends SuperclassEmployee {

	int workingHours;
	    public void Contractoremp(String name, int paymentPerHour, int workingHours) {
	    	super.name=name;
	    	super.paymentPerHour=paymentPerHour;
	        this.workingHours = workingHours;
	        System.out.println("Working hours of contractor:"+workingHours);
	    }
	 
	    public int calculateSalary() {
	    	int abc=paymentPerHour * workingHours;
	        return abc;
	        
	    }
	}

/* ii) The Contractor class inherits all properties from its parent Employee but have to provide its own 
* implementation of calculateSalary() method and multiply the value of payment per hour with given working hours. */