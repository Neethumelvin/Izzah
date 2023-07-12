package Encapulasation;

public class Bank {
private String name;
private float balance;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public void calc()
{
	float i=(balance*3*8)/100;
	System.out.println("Interest:"+i);
	balance+=i;
}

}
