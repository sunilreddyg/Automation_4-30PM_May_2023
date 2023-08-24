package pageobjects.withoutpagefactory;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTestcases 
{

	WebDriver driver;
	Testcase1 tests;
	
	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\recentdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		tests=new Testcase1(driver);
	}
	
	@Test
	public void VerifyLoginwithinvalidpassword()
	{
		tests.tc001_Verifyloginwith_invalidPassword();
	}
	
	@Test
	public void VerifyLoginvalid()
	{
		tests.tc002_verifylogin_valid();
		tests.GetAccountLogout();
	}
	
	
	
	

	


}
