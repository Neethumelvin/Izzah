package Encapulasation;
import java.util.*;
public class AtmPin {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int a,b,c;
		User atmpin=new User();
		atmpin.setName("Neethu");
		atmpin.setBalance(10000);
		atmpin.setP1(1001);
		atmpin.setP2(1234);
		atmpin.setP3(1212);
		a=atmpin.getP1();
		b=atmpin.getP2();
		c=atmpin.getP3();
		int count=0;
		while(count<3)
		{
			count++;
			System.out.println(count+".Please enter the four digit no:");
			int pin=read.nextInt();
			if(pin==a||pin==b||pin==c)
			{
				System.out.println("Welcome");
				System.out.println("Customer name:"+atmpin.getName());
				atmpin.calc();
				float bal=atmpin.getBalance();
				System.out.println("Current Balance:"+bal);
				atmpin.withdraw();
				break;
			}
			else
			{	
				System.out.println("Invalid pin");
				
			}
		
		if(count==3) 
		{
		System.out.println("3 chances over.Try after sometime!!");
		
		}
		}
		
		}		
	

}
