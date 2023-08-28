package pageobjects.withoutpagefactory.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.withoutpagefactory.HRM_Loginpage;

public class TestCase2 
{
	WebDriver driver;
	HRM_Loginpage login;
	PageObject_Keywords keywords;
	public TestCase2(WebDriver driver)
	{
		this.driver=driver;
		keywords=new PageObject_Keywords(driver);
	}
	
	
	public void VerifyLogingWithValidData()
	{
		keywords.typetext(HRM_Loginpage.username, "Admin");
		keywords.typetext(HRM_Loginpage.password, "admin123");
		keywords.ClickElemnet(HRM_Loginpage.login);
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		
		TestCase2 obj=new TestCase2(driver);
		obj.VerifyLogingWithValidData();
	}

}
