package multilevel.inheritance;

public class Derived extends Intermediate {
	public void display2()
	{
		System.out.println("Dervied class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj=new Derived();
		obj.display2();
		obj.display1();
		obj.display();
		
		Intermediate obj1=new Intermediate();
		obj1.display1();
		obj1.display();
		
		Base obj3=new Base();
		obj3.display();
	}

}
