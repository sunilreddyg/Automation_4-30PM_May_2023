package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			
			//Reading current window title
			String PageTitle=driver.getTitle();
			System.out.println("Current window title is "+PageTitle);
			
			//Reading current window URL
			String PageUrl=driver.getCurrentUrl();
			System.out.println("Current Window Url is :--> "+PageUrl);
			
			//Reading current window Dynamic ID
			String WindowID=driver.getWindowHandle();
			System.out.println("Current Window Id is --> "+WindowID);
			
			//Reading Current window pagesource
			String Pagesource=driver.getPageSource();
			System.out.println("Page Soure is :--> "+Pagesource);
			
		}
		else
		{
			System.out.println("driver launch failed");
		}
		
		
		

	}

}
