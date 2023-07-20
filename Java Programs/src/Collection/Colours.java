package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Colours {
	List<String> obj=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	public void array()
	{
		obj.add("White");
		obj.add("Blue");
		obj.add("Black");
		obj.add("Pink");
		obj.add("Green");
		System.out.println("Listed colours:"+obj);
	}
	public void retrieve()
	{
		System.out.println("Retrieve an element from a given array list.");
		System.out.println("Enter the index:");
		int c=sc.nextInt();
		System.out.println("The element at index "+c+" in the ArrayList is: " + obj.get(c));
	}
	public void	iterate()
	{
		System.out.println("Iterate through all elements in the array list:");
		System.out.println("enter the value of i:");
		int i=sc.nextInt();
		for(i=0;i<obj.size();i++)
	    {
	    	System.out.print(obj.get(i)+" ");
	    }
	}
	public void remove()
	{
		System.out.println("\nEnter the index to be remove:");
		int x=sc.nextInt();
		obj.remove(x);
		System.out.println("after the removal of an element:"+obj);
	}
	public void search()
	{
		System.out.println("Enter the colour to be search:");
		String y=sc.next();
		if(obj.contains(y))
			System.out.println("Element found in the list");
		else	 
			System.out.println("element not found in the list");
	}
	public static void main(String[] args) {
		Colours col=new Colours();
		col.array();
		col.retrieve();
		col.iterate();
		col.remove();
		col.search();
	}

}
	/*
		
		
		 System.out.println("for each loop");
		 for (String a:obj)
		 {
			 System.out.println(a+" ");
		 }
		 
		 
		 System.out.println("Iterate through all elements in the array list:");
		 Iterator<String> ab=obj.iterator();
		 while(ab.hasNext())
		 {
			 System.out.println(ab.next());
		 }
		
	}*/

/*Collection a) Write a Java program to create a new array list, add some colors (string)
 *  and print out the collection. 
 * b) Retrieve an element (at a specified index) from a given array list. 
 * c) Iterate through all elements in the array list. 
 * d) Remove the third element from the array list. 
 * e) Search an element in the array list.
 */