package Superkeywordexample;

public class Check extends Add {
	int sum;
	public void print() {
sum=super.sum%10;
System.out.println("Child Class Sum:"+sum);
System.out.println("Parent Class Sum:"+super.sum);
		if(super.sum==sum)
		System.out.println(+super.sum+"  is divisible by 10");
		else
			System.out.println(+super.sum+" is not divisible by 10");
	}
	public static void main(String[] args) {
		Check ch=new Check();
		ch.add(10, 42);
		ch.print();
	}
}
