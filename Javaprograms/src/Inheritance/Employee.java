package Inheritance;

public class Employee extends Department {
	public void printemp() {
		System.out.println("Employee Details");
		print("Neethu",30);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee age: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.printemp();
	}

}
