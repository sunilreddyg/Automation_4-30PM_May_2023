package browser_navigation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigators {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
	
		//Using Browser Navigate load new page to browser window
		driver.navigate().to("https://www.facebook.com/reg/");
		Thread.sleep(2000);
		
		
		//Navigate to back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//navigate to Next Page
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh page
		driver.navigate().refresh();
		
		
		//Close browser  [Only Active window it will Close]
		driver.close(); 
		
		
		
	}

}
