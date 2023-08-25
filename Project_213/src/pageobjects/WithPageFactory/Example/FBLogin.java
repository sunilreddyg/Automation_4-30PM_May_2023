package pageobjects.WithPageFactory.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBLogin 
{
	 //public By uid=By.id("email");
	
	 @FindBy(id ="email") public WebElement username;
	 @FindBy(name="pass") public WebElement password;
	 @FindBy(xpath = "//button[@name='login']") public WebElement LoginButton;
	 
	 
	 public void enterusername(String uid)
	 {
		username.sendKeys(uid);
	 }
		
	 public void enterpassword(String pwd)
	 {
		password.sendKeys(pwd);
	 }
		
	 public void clickLoginbutton()
	 {
		LoginButton.click();
	 }
	 
	 
	 public void userlogin(String uid,String pwd)
	 {
			enterusername(uid);
			enterpassword(pwd);
			clickLoginbutton();
	 }

}
