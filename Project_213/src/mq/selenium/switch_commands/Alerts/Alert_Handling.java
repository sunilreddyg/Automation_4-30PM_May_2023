package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Question:--> How to handle survival popup
		 * What is survival popup is?
		 * 		Some times browser throw alerts unnoticed. These
		 * 		alerts interupt your test run..inorder to catch
		 * 		error we can write testcode in try catch block
		 * 
		 * 		try
		 * 			{
		 * 				//Write test code here
		 * 			} catch(UnhandledAlertException e)
		 * 			{
		 * 				//write Error handling here
		 * 			}
		 * 
		 */
		
		try {
			WebDriver driver=new ChromeDriver();     //Launching browser method
			driver.get("http://demo.automationtesting.in/Alerts.html");
		    driver.manage().window().maximize();
		    
		    //This button make alert display at webpage
		    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		    Alert_prompt_link.click();
		    Thread.sleep(3000);
		    
		    try {
				driver.switchTo().alert().accept();      //Error Code [It throw no alert presented]
				System.out.println("Alert is Closed");
			} catch (NoAlertPresentException e) {
				System.out.println(e.getMessage());
			}
		    
		    
		    
		} catch (UnhandledAlertException e) {
			System.out.println(e.getMessage());
		}
		
	    
	   
	    
		
		

	}

}
