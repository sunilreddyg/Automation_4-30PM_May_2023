package mq.selenium.objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Login {

	public static void main(String[] args) throws Exception 
	{
		
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);  //Wait for 5 Seconds 

		//Identifying objects with xpath locator builder.
		
		//Typing email at  editbox
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//Typing password at editbox
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//Clicking on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
