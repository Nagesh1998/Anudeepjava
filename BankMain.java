abstract class Bank
{
	abstract int getBalance(int balance);
}

class BankA extends Bank
{
	int getBalance(int balance) 
	{
		return balance;
	}
}

class BankB extends Bank
{
	int getBalance(int balance) 
	{
		return balance;
	}
}
class BankC extends Bank
{
	int getBalance(int balance) 
	{
		return balance;
	}
}

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a = new BankA();
		System.out.println("In Bank-A Deposited Rs "+a.getBalance(1000));
		
		BankB b = new BankB();
		System.out.println("In Bank-B Deposited Rs "+b.getBalance(1500));
		
		BankC c = new BankC();
		System.out.println("In Bank-A Deposited Rs "+c.getBalance(2000));

	}

}
