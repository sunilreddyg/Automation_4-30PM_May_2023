package browser_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Interface {

	public static void main(String[] args)
	{
		
				/*
				 * What is WebDriver?..
				 * 			It is a interface class it is designed to
				 * 			automate all browser instances...
				 */
		        WebDriver driver=new FirefoxDriver();
		        driver.get("http://outlook.com");
		        System.out.println(driver.getTitle());
		        driver.close();
		        
		        /*
		         * Advantages:-->
		         * 			=> Support cross browser autoamtion . It means
		         * 				We design script for one browser and it can
		         * 				automate same script in all browsers..
		         */
	}

}
