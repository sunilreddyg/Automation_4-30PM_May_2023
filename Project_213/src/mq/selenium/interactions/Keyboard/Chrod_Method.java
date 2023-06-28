package mq.selenium.interactions.Keyboard;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrod_Method {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   
		   WebElement email=driver.findElement(By.id("email"));
		   new Actions(driver).sendKeys(email, "darshan").perform();
		   
		   /*
		    * chord() method helps to press multiple keys simultaneously. 
		    * It accepts the sequence of keys or strings as a parameter 
		    * to the method. To press CTRL+A, it takes, Keys. CONTROL, "a" as parameters.
		    */
		   new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, "A"), "").perform();
		   
		 

	}

}
