package Inheritance;

public class Student extends Department {
	public void printStd() {
		System.out.println("Student Details");
		dept(100);
		System.out.println("Department id:"+deptid);
		}

	public static void main(String[] args) {
		
		Student obj=new Student();
		
		obj.printStd();
		
	}

}
