package pageobjects.WithPageFactory.Runs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.WithPageFactory.Testcases.Testfor_ContactDetails;

public class RunFor_Contact 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\recentdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		Testfor_ContactDetails test=new Testfor_ContactDetails(driver);
		test.AddContactdetails();
		
	}

}
