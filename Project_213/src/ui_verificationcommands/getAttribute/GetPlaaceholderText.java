package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPlaaceholderText 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Testcase:-->
		 * 		Check during login email entrybox had
		 * 		expected placeholder text "Email address or phone number"
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		//Verify Required placeholder text presented at editbox
		WebElement Email=driver.findElement(By.id("email"));
		
		String Email_placeHolerText=Email.getAttribute("placeholder");
		if(Email_placeHolerText.equals("Email address or phone number"))
		{
			System.out.println("Placeholder text presented for email");
		}
		else
		{
			System.out.println("Placholder text not presented for email");
		}


	}

}
