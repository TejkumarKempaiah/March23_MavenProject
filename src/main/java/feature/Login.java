package feature;

public class Login
{
	public boolean Login(String username, String password)
	{
		if (username.equals("admin")&&(password.equals("admin")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
