package mq.java.Loops.For;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	public static void main(String[] args) throws Exception {
		
		String browsers[]= {"chrome","firefox"};
		WebDriver driver = null;
		
		//outter loop
	    for (int i = 0; i < browsers.length; i++)
	    {
			String EachBrowser = browsers[i];
			
			if(EachBrowser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(EachBrowser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
		
			String Footerlinks[][]= 
				{
						{"Sign Up","Sign up for Facebook | Facebook"},
						{"Log in","Log in to Facebook"},
						{"Messenger","Messenger"},
						{"Facebook Lite","Facebook Lite APK for Android"},
						{"Video","Facebook video | Facebook"},
						{"Places","Discover great places in every city | Facebook"},
						{"Games","Facebook"},
				};
			
			//Innerloop
			for (int j = 0; j < Footerlinks.length; j++) 
			{
				 driver.get("http://facebook.com");
				 
				 String LinkName=Footerlinks[j][0];
				 String pageTitle=Footerlinks[j][1];
				 
				 driver.findElement(By.linkText(LinkName)).click();
				 Thread.sleep(4000);
				 
			
				 if(driver.getTitle().contains(pageTitle))
				 {
					 System.out.println(LinkName+"\t"+"Title verified");
				 }
				 else
				 {
					 System.out.println(LinkName+"\t"+"Title not verified");
				 }
			}//Inner loop
			
			
			
		}//Outterloop
		


	}

}
