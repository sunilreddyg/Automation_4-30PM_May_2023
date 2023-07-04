package mq.selenium.javascript_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_methods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//This will manage all pageobject to load with in browser window
		
		  System.out.println("All Source loaded at webpage");
		  ((JavascriptExecutor)driver)
		  .executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		  
		 /*
		  * Difference between executescript and executeAsyncScript
		  * 
		  * 		executescript:--> It change HTML content
		  * 		executeAsyncScript:--> Manage page load timeouts
		  * 		
		  * 
		  * 		Note:--> There is alternative feature for executeAsyncScript
		  * 		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		  */

	}

}
