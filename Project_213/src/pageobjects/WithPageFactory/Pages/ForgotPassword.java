package pageobjects.WithPageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ForgotPassword{

	WebDriver driver;
	public ForgotPassword(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//p[contains(.,'Forgot your password?')]")
	public WebElement  forgotYourPassword;
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement  username;
	
	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	public WebElement  cancel;
	
	@FindBy(xpath = "//button[contains(.,'Reset Password')]")
	public WebElement  resetPasswordButton;
	
	@FindBy(xpath = "//h6[contains(.,'Reset Password')]")
	public WebElement  resetPasswordHeader;

	
	
	String pageurl="requestPasswordResetCode";
	public boolean  verifyPageurl()
	{
		boolean flag=false;
		try {
			new WebDriverWait(driver,Duration.ofSeconds(20))
			.until(ExpectedConditions.urlContains(pageurl));
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}

}