package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Reference_Exception {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		By Obj_email=By.id("email");
		driver.findElement(Obj_email).sendKeys("user1");
		
		//Method Refresh Page
		driver.navigate().refresh();
		
		driver.findElement(Obj_email).clear();
		driver.findElement(Obj_email).sendKeys("user2");
		
		
		
		  WebElement Password=driver.findElement(By.id("pass")); 
		  Password.clear();
		  Password.sendKeys("Rajesh");
		  
		  //Method Refresh Page 
		  driver.navigate().refresh();
		  
		  driver.findElement(By.id("pass")).sendKeys("dskfhkjdhfjkdhfhjdkfjdsh");
		  
		  //Once page is refreshed Password Variable Expire automatically
		 // Password.clear(); 
		 // Password.sendKeys("Admin");
		 
		
	}

}
