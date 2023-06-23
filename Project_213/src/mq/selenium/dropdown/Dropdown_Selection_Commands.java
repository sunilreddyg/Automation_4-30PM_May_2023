package mq.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands 
{

	public static void main(String[] args) 
	{
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//selecting dropdown using visible text [Option Name]
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("17");
		
		//Selecting dropdown option using Value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("9");
		
		//selecting dropdown option using index value
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(10);
		
		
		
		
	}

}
