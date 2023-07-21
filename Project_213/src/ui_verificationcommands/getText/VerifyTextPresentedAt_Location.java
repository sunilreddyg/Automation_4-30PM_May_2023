package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextPresentedAt_Location {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		//Sending blank text to email editbox
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		WebElement ErrorLocation=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Erromsg=ErrorLocation.getText();
		
		if(!Erromsg.isEmpty())
		{
			String ExpError="Enter a valid email address, phone number, or Skype name.";
			if(ExpError.equals(Erromsg))
				System.out.println("Testpass, Expected error located");
			else
				System.out.println("Testfail, Expected error not presented");
		}
		else
			System.out.println("Error doesn't contains text");
		
		
		
		
		
	}

}
