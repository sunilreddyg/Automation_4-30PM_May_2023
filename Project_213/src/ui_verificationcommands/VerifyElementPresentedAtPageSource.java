package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementPresentedAtPageSource {

	public static void main(String[] args) 
	{
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			driver.get("http://facebook.com");
			System.out.println("Site is Up and ready to use");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(driver!=null)
		{
			String pagesource=driver.getPageSource();
			if(pagesource.contains("email"))
			{
				driver.findElement(By.id("email")).sendKeys("Admin");
			}
			else
				System.out.println("Element not presented");
		}
		
		
		
		
	}

}
