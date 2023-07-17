package Abstraction;

public class Child extends Parent{

	public void ChildDisplay()
	{
		System.out.println("Welcome");
	}
	public void display()
	{
		System.out.println("Hai");
	}
	public int print(int a)
	{
		a+=10;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ch=new Child();
		ch.ParentDisplay();
		ch.ChildDisplay();
		ch.display();
		System.out.println("a="+ch.print(20));
	}

}
