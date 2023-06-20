package mq.selenium.editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Arjun"+Keys.TAB
				+"Krishna"+Keys.TAB
				+"9030248855"+Keys.TAB
				+"PWD@123");
		
		
		//Selecting dropdown options using sendkeys method
		driver.findElement(By.name("birthday_day"))
		.sendKeys("25");
		
		//Selecting dropdown options using keyboard keys
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		driver.findElement(By.id("year"))
		.sendKeys("1985");
		
		//Selecting radio butto using keybaord shortcut
		driver.findElement(By.xpath("//input[@value='2']"))
		.sendKeys(Keys.SPACE);
		
		
		//Click button
		driver.findElement(By.xpath("//button[@name='websubmit']"))
		.sendKeys(Keys.ENTER);
		
		/*
		 * Note:--> 
		 * 		Because sendkeys accept keybaord shortcuts
		 * 		webdriver doesn't throw any error.
		 */
		
		
		
		
		
		
	}

}
