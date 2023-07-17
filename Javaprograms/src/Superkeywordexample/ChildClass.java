package Superkeywordexample;

public class ChildClass extends ParentClass {

	
	public void display() {
		System.out.println("Super value: "+b);
		System.out.println("Child Class");
		}
	public ChildClass(int a)
	{
		super(222);
		System.out.println("Child Constructor: "+a);
	}
	public static void main(String[] args) {
		
		ChildClass key=new ChildClass(21);
		
	//	ParentClass key1=new ParentClass();
		key.display1();
		key.display();

	}

}
