package Exception;

public class ExceptionExample {
	
	public void operation(int a,int b)
	{
		int result;
		int arr[]=new int[5];
		try
		{
			result=a/b;
		System.out.println("result:"+result);
		for(int i=0;i<=arr.length;i++) {
			arr[i]=i+1;
			
			System.out.println(arr[i]);	
		}
		//System.exit(0);finally block will not execute,if this statement is there
		}
		catch(ArithmeticException ex)
		{
			System.out.println("division not possible");
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("Array Index Out Of Bounds Exception occur");
		}
		catch(Exception e)
		{
			System.out.println("exception occur");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample exam=new ExceptionExample();
		exam.operation(12, 3);
	}

}
