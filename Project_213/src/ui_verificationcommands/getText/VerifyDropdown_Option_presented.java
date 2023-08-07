package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdown_Option_presented 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting Dropdown option
		WebElement StateDropdown=driver.findElement(By.id("customState"));
		new Select(StateDropdown).selectByVisibleText("Telangana");
		Thread.sleep(4000);
		
		boolean flag=false;
		try {
			//Identify City Dropdown location
			WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
			new Select(CityDropdown).selectByVisibleText("Hyderabad");
			//Incase option not presented it throws NoSuchElementException
			flag=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(flag)
			System.out.println("Testpass, Required option presented");
		else
			System.out.println("Testfail, Required option not presented");
		
		

	}

}
