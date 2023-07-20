package Assignment;

public class Child {
	public static void main(String[] args) {	
		NameAndRollno nroll1=new NameAndRollno();
		nroll1.setName("Neethu");
		nroll1.setRollNo(12345);
		NameAndRollno nroll2=new NameAndRollno();
		nroll2.setName("Melvin");
		nroll2.setRollNo(14545);
		Address add1=new Address("Usha Nivas","Ernakulam","Kerala","India",589036,nroll1);  
		Address add2=new Address("Sree Villa","Erode","Tamilnadu","India",234546,nroll2);
		System.out.println("1st Student details");
		System.out.println("_________________");
		add1.display();
		System.out.println("2nd Student details");
		System.out.println("_________________");
		add2.display();
	}
}
