package Assignment;

public class Child {
	public static void main(String[] args) {
		Address add1=new Address("Usha Nivas","Ernakulam","Kerala","India",589036);  
		Address add2=new Address("Sree Villa","Erode","Tamilnadu","India",234546);
		NameAndRollno nroll1=new NameAndRollno("Neethu",12345,add1);
		NameAndRollno nroll2=new NameAndRollno("Melvin",13445,add2);
		System.out.println("1st Student details");
		System.out.println("_________________");
		nroll1.display();
		System.out.println("2nd Student details");
		System.out.println("_________________");
		nroll2.display();

	}
}
