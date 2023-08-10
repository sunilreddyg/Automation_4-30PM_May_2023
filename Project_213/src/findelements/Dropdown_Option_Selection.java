package findelements;

import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option_Selection {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");   
		driver.manage().window().maximize();
		
		//Finding list of option tags under dropdown
		WebElement MonthDD=driver.findElement(By.name("birthday_month"));
		List<WebElement> monthoptions=MonthDD.findElements(By.tagName("option"));
		
		if(monthoptions.size() > 0)
		{
			  for (WebElement EachMonth : monthoptions) 
			  {
				  	System.out.println(EachMonth.getText());
				  	EachMonth.click();
				  	Thread.sleep(500);
			  }
		}
		
		
		//Finding list of option tags under dropdown
		WebElement YearDD=driver.findElement(By.name("birthday_year"));
		List<WebElement> yearoptions=new Select(YearDD).getOptions();
		//GetOptions() method read all option tag elements under select dropdown
		// and store into list of Webelements interface class.
		
		if(!yearoptions.isEmpty())
		{
			for (int i = 0; i < yearoptions.size(); i++) 
			{
				//Get Object using index 
				WebElement EachOption=yearoptions.get(i);
				EachOption.click();
				Thread.sleep(500);
			}
		}
		
		
		
		

	}

}
