package mq.selenium.dropdown.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Is_multipleType {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:-->
		 * 		Verify dropdown allow multiple options
		 * 		to select.
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Located dropdown element and storing into WebElement reference
		WebElement State=driver.findElement(By.id("customState"));
		
		
		boolean flag=new Select(State).isMultiple();
		System.out.println("is Dropdown support multiple selection ?:--> "+flag);
		
		
		//Converting single selection dropdown into multiple selection dropdown
		//using javascript executor...
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		
		

		boolean flag1=new Select(State).isMultiple();
		System.out.println("is Dropdown support multiple selection ?:--> "+flag1);
		
		
		

	}

}
