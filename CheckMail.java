
public class CheckMail {
	String email;
	String name;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) throws InvalidMailIdException
	{
		if(!email.contains(".") || !email.contains("@")) 
		{
			throw new InvalidMailIdException("\nPlease enter a valid Email ID...");
		}	
		this.email = email;
	}
	
}
