package Exception;

import java.io.IOException;

public class ExceptionPropagation {
	public void operation(int a,int b) throws IOException
	{
		int result;
		
			result=a+b;
			if(result<15)
			throw new ArithmeticException();
			else
				throw new IOException();
		
	}
	public void display() throws IOException 
	{
		operation(12,4);
	}
		
	public static void main(String[] args)
		{
			ExceptionPropagation pro=new ExceptionPropagation();
			try
			{
				pro.display();
			}
			catch(ArithmeticException ex)
			{
				System.out.println("result<15");
			}
			catch(IOException o)
			{
				System.out.println("Exception occur");
			}
}
}
