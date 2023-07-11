package switch_commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_Button {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    //This button make alert display at webpage
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    //Switch to alert and get text presented
	    String AlertText=driver.switchTo().alert().getText();
	    System.out.println(AlertText);
	    
	    //Close Alert window
	    driver.switchTo().alert().accept();
	    
	    //identify obejct at webpage
	    driver.findElement(By.id("email"));
	    

	}

}
