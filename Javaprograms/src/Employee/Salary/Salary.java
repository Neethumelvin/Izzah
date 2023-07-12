package Employee.Salary;

public class Salary extends HraAndPf{
	float total;
	public void totalsalary()
	{
		total=basicpay+hra-pf-deduction+bonus;
		System.out.println(+total);	
	}
	public void display()
	{
		System.out.println("\n*....Salary Slip.....*");
		
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id "+empid);
		System.out.println("Basicpay:"+basicpay);
		System.out.println("Deduction:"+deduction);
		System.out.println("Bonus:"+bonus);
		
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		
		System.out.println("Total Salary:"+total);
		System.out.println("*........****........*");
		
	}
	
	public static void main(String[] args) {
		
		Salary sal=new Salary();
		sal.Salary();
		sal.hraandpf();
		sal.totalsalary();
		sal.display();
	}

}

