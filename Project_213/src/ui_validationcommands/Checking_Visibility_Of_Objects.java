package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking_Visibility_Of_Objects {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
								
	
		//Identify Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		if(Signin_btn.isDisplayed())
		{
			Signin_btn.click();
			Thread.sleep(4000);
		}
		else
			System.out.println("Element not visiblet at webpage");
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		if(Email.isDisplayed() && Email.isEnabled())
		{
			Email.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		}
		else
			System.out.println("Email Field is not visble at webpage");
		
		
		Thread.sleep(4000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='i0118']"));
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("Admin@13");
		}
		else
			System.out.println("password is not visiblet at webpage");

		/*
		 * Note:--> For every object need not to verify object visible and
		 * 			enabled status, Because selenium is desinged to perform
		 * 			action on visible and enabled objects only.
		 * 		
		 * 			WebDriver throws below exceptions when user try invalid
		 * 			actions.
		 * 
		 * ElementNotvisibleException   
		 * 			==> It Throws When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> It Throws When user perform action on disabled element
		 */
		

	}

}
