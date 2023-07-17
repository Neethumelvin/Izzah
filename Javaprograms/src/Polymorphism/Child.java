package Polymorphism;

public class Child extends Parent{
	public int operation(int x, int y) {
   	super.operation(2, 3);
		int result= x*y;
		System.out.println("Result:"+result);
		System.out.println("Result:"+super.result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Child ch=new Child();
		ch.operation(10, 20);
		Parent pa=new Parent();
		pa.operation(13, 30);
		pa.display();*/
		
		//another method
		Parent par=new Child();
		par.operation(10, 30);
		par.display();
		
	}

}
