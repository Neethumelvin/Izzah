package Superkeywordexample;

public class DerivedClass extends BaseClass {
	int num;
public void display(int num) {
	
super.num=num;	
this.num=super.num+10;
num++;
}
public void print() {
	System.out.println("child class:"+num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass child=new DerivedClass();
		child.display(23);
		child.display1();
		child.print();
	}

}
