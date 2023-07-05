package Employee.Salary;
import java.util.Scanner;

public class SalarySlip {
	Scanner read=new Scanner(System.in);
	String name; 
	int empid;
	float basicpay,deduction,bonus,hra,pf,total;
	public void Salary()
	{
	System.out.println("Enter the Employee name: ");
	name=read.nextLine();
	System.out.println("Enter the employee id: ");
	empid=read.nextInt();
	System.out.println("Enter the basic pay: "); 
	basicpay= read.nextFloat();
	System.out.println("Enter deduction amount: "); 
	deduction= read.nextFloat();
	System.out.println("Enter the bonus amount: "); 
	bonus= read.nextFloat();
	}
	
	public static void main(String[] args) {
		

	}

}
