package ui_verificationcommands.DropdownTestmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_Options {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Testcase:--> Try to select multiple options under
		 * 				single dropdown..
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Located dropdown element and storing into WebElement reference
		WebElement State=driver.findElement(By.id("customState"));
	
		//Converting single selection dropdown into multiple selection dropdown
		//using javascript executor...
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		
		
		//Get Dropdown multiple selection type
		boolean flag=new Select(State).isMultiple();
		
		if (flag==true) 
		{
			System.out.println("Dropdown is multiple type selection");
			Select StateSelection=new Select(State);
			StateSelection.deselectAll();    //This method only works when dropdo0wn is multiple selection type
			StateSelection.selectByIndex(3);
			StateSelection.selectByIndex(5);
			StateSelection.selectByIndex(8);
			
			//Check Dropdown is accept more than one option to select
			int Count=StateSelection.getAllSelectedOptions().size();
			if(Count > 1)  //Greaterthan is a operator it return boolean value true/false..
				System.out.println("Multiple Options Selected");
			else
				System.out.println("SIngle Option selected");
			
			
			//Read only select options
			for (WebElement EachOption : StateSelection.getAllSelectedOptions()) 
			{
				System.out.println(EachOption.getText());
			}
			
			
			
		} 
		else 
		{
			System.out.println("dropdown is single option selection type");
		}
		
		
		
		
	}

}
