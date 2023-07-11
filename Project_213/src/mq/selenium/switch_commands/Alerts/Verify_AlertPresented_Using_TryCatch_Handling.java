package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_AlertPresented_Using_TryCatch_Handling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    //This button make alert display at webpage
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    /*
	     * Question:--> How do you check alert presented at webpage
	     */
	    boolean flag=false;
	    try {
			driver.switchTo().alert();
			flag=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	    
	    //This is a decision to verify alert presented at webpage
	    if(flag)
	    {
	    	driver.switchTo().alert().accept();
	    	System.out.println("Alert presented and closed");
	    }
	    else
	    {
	    	System.out.println("Alert is not presented");
	    }
	    
	    
	    

	}

}
