package switch_commands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Target_ActiveElement {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		
	    
	    //Using Switch method
	    driver.switchTo().activeElement().sendKeys("Darshan");
	    
	    //Using mouse interactions
	    new Actions(driver).sendKeys("R").perform();
		
	}

}
