package ui_verificationcommands.DropdownTestmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Selected_options_At_Dropdown 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		WebElement MonthDD=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		new Select(MonthDD).selectByVisibleText("Dec");    //Select December month
		
		//Read Selected options at dropdown
		String Option=new Select(MonthDD).getFirstSelectedOption().getText();
		if(Option.equals("Dec"))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		
		
		/*
		 * Note:-->
		 * 			Only use at real dropdown which contains select tag
		 */

	}

}
