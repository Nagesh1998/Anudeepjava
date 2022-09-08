
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b=sc.nextInt();
		
		
		System.out.println("1. Add \n2. Subtract \n3. Multiply \n4. Divide \5.Mod");
		int choice=sc.nextInt();
		
		sc.close();
		
		switch(choice){
			case 1:
				int sum=a+b;
				System.out.println("Addition is : "+sum);
				break;
			
			case 2:
				int sub=a-b;
				System.out.println("Subtraction is : "+sub);
				break;

			
			case 3:
				int mul=a*b;
				System.out.println("Multiplication is : "+mul);
				break;

			
			case 4:
				int div=a/b;
				System.out.println("Division is : "+div);
				break;
				
			case 5:
				int mod=a%b;
				System.out.println("Division is : "+mod);
				break;

			default:
				System.out.println("Enter valid options : ");
			}
		
	}

}

