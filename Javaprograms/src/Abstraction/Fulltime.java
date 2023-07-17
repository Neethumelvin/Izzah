package Abstraction;
import java.util.*;
public class Fulltime extends SuperclassEmployee{
	static final int WORK_HR=8;
	    public void FullTimeEmployee(String name, int paymentPerHour) {
	        super.name=name;
	        super.paymentPerHour=paymentPerHour;
	    }
	   
	    public int calculateSalary() {
	        return paymentPerHour * WORK_HR;
	    }
	
public static void main(String[] args) {
	int option;
	Scanner read=new Scanner(System.in);
	System.out.println("1. Contractor Employee \n2. Fulltime Employee \n ");  
	System.out.println("Enter your choice: "); 
    option = read.nextInt();
    switch(option)
	{
	case 1:
		Fulltime full=new Fulltime();
		full.FullTimeEmployee("Neethu", 400);
		 System.out.println("Total Salary:"+full.calculateSalary());
	break;
	case 2:
		Contractor cont=new Contractor();
		cont.Contractoremp("Melvin", 500, 6);
		int xyz=cont.calculateSalary();
		System.out.println("Total Salary:"+xyz);
	
}
}}

/* iii) The FullTimeEmployee class also has its own implementation of calculateSalary()method. 
* In this case we just multiply by constant 8 hours.*/