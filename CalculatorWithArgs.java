
public class CalculatorWithArgs {
	//declaring method for int values
	public int  addition(int a,int...b)
	{
		int sum = 0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		return sum;
	}
	public int  substraction(int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public int multi (int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public int division(int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	// declaring method for double values
	public double addition(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double substraction(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double multi(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double division(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	
	public class CalciMain {
		 public static void main(String[] args)//method
		 {
			 CalculatorWithArgs calcii=new CalculatorWithArgs();//instanciating object..
			 //declaring int method
			 System.out.println("addition of 2 int:"+calcii.addition(7,6));
			 System.out.println("substraction of 2 int:"+calcii.substraction(7,6));
			 System.out.println("multiplication of 2 int:"+calcii.multi(7,6));
			 System.out.println("division of 2 int:"+calcii.division(7,6));
			 //declaring double method
			 System.out.println("addition of 2 double:"+calcii.addition(6.6,6.7));
			 System.out.println("substraction of 2 double:"+calcii.addition(7.7,6.4));
			 System.out.println("multiplication of 2 double:"+calcii.addition(7.7,6.7));
			 System.out.println("division of 2 double :"+calcii.addition(6.7,7.7));
		 }
		}

}

	