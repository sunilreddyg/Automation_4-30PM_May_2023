package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VerifyAlertPresented_Using_Conditions {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    //This button make alert display at webpage
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    //This Decision verify alert presentead at webpage
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	driver.switchTo().alert().accept();
	    	System.out.println("Alert window is closed");
	    }
	    else
	    {
	    	System.out.println("No alert presented");
	    }

	}

}
