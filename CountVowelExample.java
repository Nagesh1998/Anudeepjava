import java.util.Scanner;

public class CountVowelExample 
{
	public void countVowel(String str) throws CheckedException 
	{
		int count=0;
		char[] ch =  new char[str.length()];//creating array of string length
		
		for(int i=0;i<str.length();i++)//copying character by character in array 
		{
			ch[i]=str.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++) //printing the elements 
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			{
				count++;	
			}
			if(ch[i]=='x') 
			{
				throw new CheckedException("\n array contains 'x' Please Enter a valid String... ");
			}
			System.out.print(ch[i]+" ");
		}
		System.out.println("\n\nNo Of Vowel in Strings Are : "+count);
		
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i]=='x') 
			{
				throw new CheckedException("\n array contains 'x' Please Enter a valid String... ");
			}
		}
	}
	
	public class CheckedException extends Exception
	{
		public CheckedException() 
		{
			super();
		}
		public CheckedException(String message) 
		{
			super(message);		
		}
    }
	
	public static void main(String[] args) { 
		CountVowelExample t = new CountVowelExample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		try 
		{
			t.countVowel(str);
		}
		catch(CheckedException ce) 
		{
			System.out.println(ce);
		}
	}	
}
