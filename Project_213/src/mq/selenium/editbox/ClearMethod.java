package mq.selenium.editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearMethod 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);  //Wait for 5 Seconds 

	
		//Login Syntax
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		
		//Clicking on PIM TAB
		driver.findElement(By.xpath("//span[contains(.,'PIM')]")).click();
		Thread.sleep(3000);
		
		//Select Second Checkbox Under PIM table
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]")).click();
		
		
		//click on Add button
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		Thread.sleep(6000);
		

		//Clear text before typing value   [Using Mouse and Keyboard interaction]
		WebElement ID=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		new Actions(driver).click(ID).keyDown(Keys.CONTROL).sendKeys("A").sendKeys(Keys.BACK_SPACE).perform();
		//It Clear input presented at textbox
		
		
		
		
		
		
		
		

	}

}
