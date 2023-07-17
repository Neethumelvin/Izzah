package Interface;

public class Child implements Interface3 {

	int n;
	public int print1(int x) {
		
		n=x*10;
		return n;
	}

	public void display2() {
		
		System.out.println("hello");
		n++;
		System.out.println("n="+n);
	}

	public void print() {
		
		System.out.println("Interface 2");
	}

	public void display3() {
		int abc=MIN+100;
		System.out.println("Interface3: "+abc);
		
	}
	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println("Interface1 :"+ch.print1(35));
	
		ch.print();
		ch.display2();
		ch.display3();
	}

	
}
