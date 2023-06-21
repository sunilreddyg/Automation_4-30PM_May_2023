package mq.selenium.Link;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Example {

	public static void main(String[] args) {
		
		
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		//Set default timeout to wait for 20 seconds when object was not found.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Clicking link with original link name
		driver.findElement(By.linkText("Locations")).click();
		
		driver.findElement(By.linkText("India")).click();
		
		driver.findElement(By.linkText("Kolkata")).click();

		//Clicking link using partial link text..
		driver.findElement(By.partialLinkText("INOX Cinema,kol")).click();
	}

}
