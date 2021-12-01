//demonstrate class and objcet through simple application.
package com.classandobject;

class Account
{
	int acc_no;
	String name;
	float amount;
	void insert(int a_no,String n,float a)
	{
		acc_no = a_no;
		name = n;
		amount = a;
	}
	void deposit(float amt)
	{
		amount = amount+amt;
		System.out.println(amt +" Deposited");
	}
	void withdraw(float amt)
	{
		if(amount < amt)
		{
			System.out.println("Insufficient balance..!!");
		}
		else
		{
			amount = amount - amt;
			System.out.println(amt+" Withdraw");
		}
	}
	void checkBalance()
	{
		System.out.println(amount);
	}
	void DisplyInfo()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
}
public class TestAccount {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.insert(832345, "Alice",1000);
		ac.DisplyInfo();
		ac.checkBalance();
		ac.deposit(4000);
		ac.checkBalance();
		ac.withdraw(1500);
		ac.checkBalance();

	}

}
