package Exception;

public class ThrowExample {
	public void operation(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int result;
		try
		{
			result=a+b;
			if(result<15)
			throw new ArithmeticException();
			else
				throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("division not possible");
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Array Index Out Of Bounds Exception occur");
		}
	}
		public static void main(String[] args) {
			ThrowExample th=new ThrowExample();
			th.operation(12, 6);
		}
}
