package Encapulasation;

public class Customer {

	public static void main(String[] args) {
		
Bank details=new Bank();
details.setName("Neethu");
details.setBalance(20000);

System.out.println("Customer name:"+details.getName());

details.calc();
float bal=details.getBalance();
System.out.println("Balance amount:"+bal);
	}

}
