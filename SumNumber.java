
public class SumNumber {
	
	public void addNumber() {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumNumber a = new SumNumber();
		a.addNumber();
	}

}
