package pageobjects.WithPageFactory.Keywords;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	public WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public void SetupChrome()
	{
		try {
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	public void static_time(long msec)
	{
		try {
			Thread.sleep(msec);
		} catch (Exception e) {
			
		}
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}

}