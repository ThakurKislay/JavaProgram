package BasicJavaProgram;

public class AccountDriver {

	public static void main(String[] args) 
	{
		Account a1=new Account();
		a1.insert(12345, "Kislay Kumar", 135000);
		a1.display();
		a1.checkBalance();
		a1.deposit(20000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.display();
		a1.insert(543210, "Mansi Chauhan", 90500);
		a1.display();
		a1.checkBalance();
		a1.deposit(20500);
		a1.checkBalance();
		a1.withdraw(20000);
		a1.checkBalance();
	}

}
