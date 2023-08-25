package pageobjects.WithPageFactory.Example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLinks 
{
	@FindBy(xpath = "//a[@href='/reg/'][contains(.,'Sign Up')]")
	public WebElement Signup;
	
	
	@FindBy(xpath = "//a[@href='/login/']")
	public WebElement login;
	
	public void clickSingupLink()
	{
			Signup.click();
	}
	
	public void clickloginLink()
	{
			login.click();
	}
}
