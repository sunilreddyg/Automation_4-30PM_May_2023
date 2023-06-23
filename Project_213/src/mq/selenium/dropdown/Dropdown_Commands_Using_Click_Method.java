package mq.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Commands_Using_Click_Method {

	public static void main(String[] args) throws Exception 
	{
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().window().maximize();
		
		/*
		 * 1. First locating "select" tag as parent element
		 * 2. Second "option" tag as child element
		 * 3. Performing click method on child element
		 */
		WebElement Country=driver.findElement(By.id("customState"));
		Country.findElement(By.xpath("//option[@value='telangana'][contains(.,'Telangana')]")).click();
		
		
		/*
		 * Select direct option tag xpath the Perform click method
		 */
		Thread.sleep(5000);
		driver.findElement
		(By.xpath("//option[@value='hyderabad'][contains(.,'Hyderabad')]")).click();
		
		
		
		//Storing PageLocation into Reference name
		Thread.sleep(4000);
		WebElement Location=driver.findElement(By.name("localityName"));
		Location.sendKeys("SR-Nagar");
		
		//Selecting dropdown option using index number
		Thread.sleep(4000);
		WebElement Radius=driver.findElement(By.id("customRadius"));
		new Select(Radius).deselectByIndex(1);
		
		//Clicking button 
		WebElement SearchButton =driver.findElement(By.xpath("//button[contains(.,'Search')]"));
		SearchButton.click();
		
		
	}

}
