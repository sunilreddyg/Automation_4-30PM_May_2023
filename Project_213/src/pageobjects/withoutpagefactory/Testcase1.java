package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class Testcase1 
{
	
	public WebDriver driver;
	HRM_Loginpage loginpage;
	AccountPage accountpage;
	
	public Testcase1(WebDriver driver) 
	{
		this.driver=driver;
		loginpage=new HRM_Loginpage(driver);
		accountpage=new AccountPage(driver);
	}
	
	String UID="Admin";
	String InvalidPwd="admin@123";
	public void tc001_Verifyloginwith_invalidPassword()
	{
		if(loginpage.verifyLoginpageDisplayed())
		{
			loginpage.userlogin(UID, InvalidPwd);
			if(loginpage.verifyErrorDisplayed())
				System.out.println("Testpass,Error Displayed");
			else
				System.out.println("Testfail, Error Not Displayed");
		}
		else
			System.out.println("Login page is not displayed");
	}
	
	String PWD="admin123";
	public void tc002_verifylogin_valid()
	{
		if(loginpage.verifyLoginpageDisplayed())
		{
			loginpage.userlogin(UID, PWD);
			if(accountpage.verifyloginSuccessful())
				System.out.println("Login IS passed");
			else
				System.out.println("login failed");
		}
		else
			System.out.println("Login page is not displayed");
	}
	
	
	public void GetAccountLogout()
	{
		accountpage.userlogout();
	}
	
}
	
	


