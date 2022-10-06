import java.util.Scanner;

public class Palihdrome {
	
	public void checkPalihdrome() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();
		String rev_str="";
		String org_str=str;
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev_str=rev_str+str.charAt(i);
		}
		if(org_str.equals(rev_str)) 
		{
			System.out.println("The Given String is Palihdrome and the string is "+str);
		}
		else
			System.out.println("The Given String is Not Palihdrome and the string is "+str);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Palihdrome p = new Palihdrome();
		p.checkPalihdrome();
	}

}
