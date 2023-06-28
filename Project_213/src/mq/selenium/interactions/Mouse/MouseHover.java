package mq.selenium.interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Perform Mouse hover action at selected location
		WebElement JobsMenu=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		new Actions(driver).moveToElement(JobsMenu).perform();
		
		WebElement CreateJobAlert=driver.findElement(By.xpath("//a[contains(.,'Create free job alert')]"));
		new Actions(driver).click(CreateJobAlert).perform();
		
		
	}

}
