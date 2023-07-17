package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {
	public void array()
	{
		List<String> obj=new ArrayList<String>();
		obj.add("Neethu");
		obj.add("Izzah");
		obj.add("Melvin");
		obj.add("Mariam");
		System.out.println(obj);
		obj.remove(3);
		System.out.println("After deletion"+obj);
		System.out.println(obj.size());
		
		Collections.sort(obj);
		System.out.println(obj);
	    for(int i=0;i<obj.size();i++)
	    {
	    	System.out.println(obj.get(i));
	    }
	}
	public static void main(String[] args) {
		ArrayListExamples arr=new ArrayListExamples();
		arr.array();

	}

}
