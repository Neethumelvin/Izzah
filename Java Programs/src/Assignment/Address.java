package Assignment;

public class Address {
	String housename,city,state,country;  
	int pincde;
	NameAndRollno nameroll;
	  
	public Address(String housename,String city, String state, String country,int pincde,NameAndRollno nameroll) 
	{
		this.housename=housename;
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	    this.pincde=pincde;
	    this.nameroll=nameroll;
	} 
	public void display()
	{  
		System.out.print(nameroll.getName()); 
		System.out.println("("+nameroll.getRollNo()+")");
		System.out.println(housename+"\n"+city+"\n" +state+"\n"+country+"\n"+pincde);  
	} 
}
