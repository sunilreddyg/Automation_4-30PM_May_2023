package pageobjects.WithPageFactory.Example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_For_Signup {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\recentdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * Note:--> To identify object using @findby annotation
		 * 			we must use pageFactory Class
		 */
		
		FooterLinks footerlinks=PageFactory.initElements(driver, FooterLinks.class);
		footerlinks.clickSingupLink();
		
		FbSignup signup=PageFactory.initElements(driver, FbSignup.class);
		
		if(signup.firstname.isDisplayed())
		{
			signup.enterfirstname("sunil");
			signup.enterSurname("Gajjala");
		}
		
		
		driver.navigate().refresh();
		
		signup.registrationwithoutemail("Ajay", "Shetyy", "12", "Feb");
		
		
		
		
		
		
	}

}
