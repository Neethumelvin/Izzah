package Assignment;

public class NameAndRollno {
		String name;
		int rollNo;	
		Address add;

	public NameAndRollno(String name, int rollNo,Address add)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.add=add;
	}
	public void display()
	{  
		System.out.print(name); 
		System.out.println("("+rollNo+")");
		System.out.println(add.housename+"\n"+add.city+"\n" +add.state+"\n"+add.country+"\n"+add.pincde);  
	} 
	
}