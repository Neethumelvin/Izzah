package multilevel.inheritance;

public class Car extends FourWheeler{
	public void cars()
	{
		System.out.println("Different types of car");
		}

	public static void main(String[] args) {
		Car car=new Car();
		car.vehicle();
		car.fourwheeler();
		car.cars();

	}

}
