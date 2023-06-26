package mq.selenium.dropdown.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_Commands 
{
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://bridgeqsys.com/demo.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		WebElement SelectMenu=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu.click();
		Thread.sleep(2000);
		
		
		WebElement Country=driver.findElement(By.id("exampleFormControlSelect2"));
		Select Cntry=new Select(Country);
		
		//Decision to check dropdown is multiple type
		if(Cntry.isMultiple())
		{
			 Cntry.deselectAll();
			 Cntry.selectByIndex(1);
			 Cntry.selectByIndex(3);
			 
			 Thread.sleep(2000);
			 //Decision to check more than one options is selected
			 if(Cntry.getAllSelectedOptions().size()>1) 
			 {
					 //Deselect One option
					 Cntry.deselectByIndex(1);
					 
					 //Decision to check Deselection option count
					 if(Cntry.getAllSelectedOptions().size()==1)
					 {
						 System.out.println("Deselection working");
					 }
					 else
					 {
						 System.out.println("Deselction failed");
					 }
			 }
			 else
			 {
				 System.out.println("Drodpown is multiple type but only selection one option at dropdown");
			 }
			 
		}
		else
		{
			System.out.println("Dropdown is not multiple type selection");
		}
		
		
		
	}

}
