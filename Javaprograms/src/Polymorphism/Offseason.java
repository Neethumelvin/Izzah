package Polymorphism;
import java.util.Scanner;

public class Offseason extends Onseason {

	double discount;
	public double discount(int cost)
	{
	
		discount=0.85*cost;
		return discount;
	}
	public void display()
	{
		Scanner obj=new Scanner(System.in);

        System.out.print("Enter cost: ");
        int cost=obj.nextInt();
        
 System.out.println("Season:( Onseason/ Offseason ):");
      String  season=obj.next();
        
     
       
      
    
        if(season.contains("Offseason"))
        {
        	System.out.println("Offseason amount:"+discount(cost));
        }
        else
        	System.out.println("Onseason amount:"+super.discount(cost));
        
	}
	
	
		
	public static void main(String[] args) {
	
		   Offseason dis1=new Offseason();
		   dis1.display();
		  
		   }
}
