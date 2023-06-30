package mq.selenium.interactions.Mouse.Scroll;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws Exception 
	{
		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		  
		   WebElement BackToTop=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		   new Actions(driver).scrollToElement(BackToTop).perform();
		   
		   WebElement SignInBtn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[4]"));
		   SignInBtn.click();
		   
		   //By default scroll object to downside of the page
		   
	}

}
