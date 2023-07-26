package ui_verificationcommands.getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTagname {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		WebElement Day=driver.findElement(By.id("day"));
		if(Day.getTagName().equals("select"))
		{
			new Select(Day).selectByVisibleText("23");
		}
		else
		{
			System.out.println("Element doesn't contain select class");
		}

	}

}
