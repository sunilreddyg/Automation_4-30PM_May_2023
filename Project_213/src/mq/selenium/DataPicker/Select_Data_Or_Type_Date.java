package mq.selenium.DataPicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Data_Or_Type_Date {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*
		 * Note:--> Usually Datepickers integrated with Editboxes.
		 *           If Editbox is in writable format. So that
		 *           we can type date insted of picking..
		 */
		
		WebElement InputField=driver.findElement(By.id("datepicker"));
		InputField.click();   //Open Calendar
		
		//Pick any date
		driver.findElement(By.linkText("27")).click();
		
		Thread.sleep(5000);
		
		//Clear Date and Type New Date
		/*
		 * Note:-->
		 * 		1. Check editbox is in writable format
		 * 		2. Type date with in format 
		 */
		InputField.clear();   //Clear Existing text from input field
		InputField.sendKeys("10/26/2023"+Keys.ESCAPE);
		
		/*
		 * Why Escape key here:-->
		 * 		Whey date typed instead of selecting from calendar
		 * 		It doesn't Close it self. To valid Interactable exceptions
		 * 		using keyboard shortcut we are escaping calendar from webpage
		 */
		
		
		/*
		 * Example:-->
		 * 		https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html
		 * 		=> Select Year and Month From Dropdown
		 * 		=> Select any date from calendar
		 */

	}

}
