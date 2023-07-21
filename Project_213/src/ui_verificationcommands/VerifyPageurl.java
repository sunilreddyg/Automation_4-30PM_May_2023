package ui_verificationcommands;

import org.junit.Test;
import commonLibrary.CommonActions;

public class VerifyPageurl extends CommonActions
{

	String browsername="chrome";
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test
	public void test1()
	{
		setup(browsername, url);
	    String Pageurl=driver.getCurrentUrl();
	    if(Pageurl.contains("auth/login"))
	    {
	    	//user login syntax
	    	typetext("//input[@name='username']", "Admin");
			typekeys("//input[@type='password']", "admin123");
			ClickElemnet("//button[@type='submit']");
			
			if(driver.getCurrentUrl().contains("dashboard/index"))
			{
				System.out.println("Login Successful");
				ClickElemnet("//span[contains(.,'PIM')]");
				
				//Verifying url presented using reusable keyword
				if(VerifyUrl("pim/viewEmployeeList"))
					System.out.println("PIM page verified");
				else
					System.out.println("Wrong url Presented");
			}
			else
				System.out.println("Login failed");
	    }
		
	}


}
