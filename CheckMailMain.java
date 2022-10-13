
public class CheckMailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckMail c =  new CheckMail();
		c.setName("Nagesh");
		
		try 
		{
			c.setEmail("Nagesh1223@gmail.com");
		}
		catch(InvalidMailIdException ime) 
		{
			System.out.println(ime);
		}
		System.out.println("Name is "+c.getName());
		System.out.println("Email ID  is :"+c.getEmail());
	}
}
