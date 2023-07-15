package Interface;
import java.util.*;

public class Hdfc implements Rbi {
	
	Scanner input = new Scanner(System.in);
	double RDamnt;
int periods;
  
	public double recurringDeposit(double amount)
	{
		  this.RDamnt = amount;
	      System.out.println("Enter your tenure period:");
	      periods =input.nextInt();
	      double totamt=RDamnt * RDIntrstRate*periods;
	      System.out.println("total amount after "+periods+" years of time:"+totamt);
	      return totamt;
	}
	public static void main(String[] args) {

Hdfc bank=new Hdfc();
bank.recurringDeposit(25000d);


	}

}
/*Write a program, where RBI will be an interface, have a method recurringDeposit which can accept the amount and duration. 
 This must be implemented in class HDFC. 
 i) When a customer deposit amount in HDFC, they must be able to know how much amount
 they will get after depositing for n period of time. 
 ii) Interest rate is defined in RBI interface
 */