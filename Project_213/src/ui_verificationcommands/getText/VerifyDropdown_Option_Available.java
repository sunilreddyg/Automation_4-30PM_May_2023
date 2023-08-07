package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdown_Option_Available 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verify Expected City Available at City Dropdown
		 * 
		 * 			Given site url "https://v1.hdfcbank.com/branch-atm-locator"
		 * 			When user select any State Option
		 * 			Then verify Respected City names displayed under city dropdown
		 */
		

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting Dropdown option
		WebElement StateDropdown=driver.findElement(By.id("customState"));
		new Select(StateDropdown).selectByVisibleText("Telangana");
		
		
		Thread.sleep(4000); //Timeout to load City Dropdowns list
		WebElement CityDropdown=driver.findElement(By.id("customCity"));
		String Cities=CityDropdown.getText();
		
		if(Cities.contains("Hyderabad"))
			System.out.println("Testpass, Required city available");
		else
			System.out.println("Testfail, Required city not available");
	}

}
