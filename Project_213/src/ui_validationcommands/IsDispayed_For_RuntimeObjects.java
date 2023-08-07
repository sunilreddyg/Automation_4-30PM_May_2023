package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispayed_For_RuntimeObjects {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Verify Retype Email is visible after typing valid email
		 */
		
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com/reg/");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window

		
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.clear();
		Email.sendKeys("info@gmail.com");
		Thread.sleep(2000);
		
		try {
			WebElement Retype_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			if(Retype_email.isDisplayed())
				System.out.println("Object Visiblet Webpage");
			else
				System.out.println("Object not visible at webpage");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		

	}

}
