package Hiearchical.inheritance;

public class Child3 extends Parent{
	public void print3()
	{
		System.out.println("Child 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 obj=new Child3();
		obj.print3();
		obj.print();
		Child2 obj1=new Child2();
		obj1.print2();
		obj1.print();
		Child1 obj2=new Child1();
		obj2.print1();
		obj2.print();
		Parent obj3=new Parent();
		obj3.print();
	}

}
