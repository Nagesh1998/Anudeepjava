import java.util.Scanner;

public class PrimeRange {
	public void prime(int start,int end) {
		int i,j;
		for(i=start;i<=end;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.print(" "+j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting point : ");
		int start=sc.nextInt();
		
		System.out.println("Enter the ending point : ");
		int end=sc.nextInt();
		
		PrimeRange p = new PrimeRange();
		System.out.println("Prime numbers are : ");
		p.prime(start, end);
		
		sc.close();

	}

}
