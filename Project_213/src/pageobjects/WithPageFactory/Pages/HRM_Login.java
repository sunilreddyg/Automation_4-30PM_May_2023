package pageobjects.WithPageFactory.Pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_Login 
{
		WebDriver driver;
		public HRM_Login(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);  //Toidentify page object elements
			this.driver=driver;   //Bring driver reference from outside class and assigning with in class
		}
	
		//@Findby annotation look for object at webpage
		@FindBy(xpath="//input[@name='username']")
		public WebElement username;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(xpath = "//button[contains(.,'Login')]")
		public WebElement loginbutton;
		
			
	
		
		public void statictime(long ms)
		{
			try {
				Thread.sleep(ms);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void Enterusername(String UID)
		{
			statictime(3000);
			username.sendKeys(UID);
		}
		
		public void enterpassword(String pwd)
		{
			statictime(1000);
			password.sendKeys(pwd);
		}
		
		public void clickloginbutton()
		{
			loginbutton.click();
		}
		
		
		public void Userlogin(String UID,String pwd)
		{
			Enterusername(UID);
			enterpassword(pwd);
			clickloginbutton();
			capturescreen("login");
		}
		
		String screenpath="Screens\\";
		public void capturescreen(String imagename)
		{
			try {
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File(screenpath+imagename+".png"));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		

}
