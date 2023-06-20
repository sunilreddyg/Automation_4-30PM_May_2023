package mq.selenium.editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//Clicking on Signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type email and press Enter Key
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		
		Thread.sleep(4000);   //wait for 4 seconds
		
		
		//Type password and press enter
		driver.findElement(By.name("passwd"))
		.sendKeys("Sunil@#1234"+Keys.ENTER);
		
		
		
		
		
		
		
		
	}

}
