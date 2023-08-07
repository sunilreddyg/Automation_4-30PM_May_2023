package ui_verificationcommands.DropdownTestmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_From_Dropdown 
{

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		WebElement MonthDD=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		//Read Every Option tag under MonthDropdown
		int Count=new Select(MonthDD).getOptions().size();
		if(Count==12)
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		
		
		
		//Read Each Option Under Dropdown
		for (WebElement Eachoption : new Select(MonthDD).getOptions()) 
		{
			System.out.println(Eachoption.getText());
		}
		
		
		
		
		

	}

}
