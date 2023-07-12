package Encapulasation;

import java.util.Scanner;

public class User {
	private int p1,p2,p3;
	private String name;
	private float balance;
	Scanner read=new Scanner(System.in);
	
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
	public int getP3() {
		return p3;
	}
	public void setP3(int p3) {
		this.p3 = p3;
	}
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
	//	System.out.println("Interest:"+i);
		balance+=i;
	}
		
	public void withdraw()
	{
		
		System.out.println("Please enter the withdraw amount:");
		float with=read.nextFloat();
		balance-=with;
		System.out.println("Account Balance:"+balance);
	}
	}
