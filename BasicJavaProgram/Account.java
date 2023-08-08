package BasicJavaProgram;

public class Account 
{
	int acc_no;
	String name;
	double amount;
	//Method to initilize object
	void insert(int a,String n,double amt)
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	//Deposit Methods
	void deposit(double amt)
	{
		amount=amount+amt;
		System.out.println(amt+"deposited:");
	}
	//Withdraw method
	void withdraw(double amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}
	}
	//method to check the balance of the account
	void checkBalance()
	{
		System.out.println("Current Balance is:"+amount);
	}
	//method to display the value of an Object
	void display()
	{
		System.out.println("Your Account number is:"+acc_no);
		System.out.println("Bank Holder name is:"+name);
		System.out.println("Actual amount is:"+amount);
		System.err.println("================================");
	}
}
