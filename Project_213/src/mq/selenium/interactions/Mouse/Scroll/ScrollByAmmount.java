package mq.selenium.interactions.Mouse.Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmmount {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		  
		   WebElement BackToTop=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		   int ObjY=BackToTop.getRect().y;
		   
		   new Actions(driver).scrollByAmount(0, ObjY).perform();
		   //scrollByAmount:--> Scroll page until object get to view port.But your required object
		   //will be presented top side of webpage
		   
		   
		   /*
		    * deltax :--> Scroll your page left to right
		    * delaty ;--> Scroll your page from top to bottom
		    * 	Note:--> Use negative values to do opposite
		    */
		   
		   
	}

}
