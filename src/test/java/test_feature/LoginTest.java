package test_feature;

import org.testng.Assert;
import org.testng.annotations.Test;
import feature.Login;

public class LoginTest
{
	public Login l1 = new Login();
	
	@Test
	public void loginTest()
	{
		 boolean actual_login_result = l1.Login("admin", "admin");
		 Assert.assertEquals(actual_login_result, true);
		 System.out.println("--logintest completed--");	
	}
}
