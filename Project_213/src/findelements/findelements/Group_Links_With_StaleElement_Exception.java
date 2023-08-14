package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links_With_StaleElement_Exception 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		WebElement MenuTabs_location=driver.findElement(By.xpath("(//div[@class='_3noxt'])[1]"));
		List<WebElement> Tabs=MenuTabs_location.findElements(By.className("_2EGQY"));
		System.out.println(Tabs.size());
		
		for (int i = 0; i < Tabs.size()-1; i++) 
		{
				//Read Each tab using index number
				WebElement SingleTab=Tabs.get(i);
				SingleTab.click();
				Thread.sleep(2000);
				
				driver.navigate().back();
				
				//Restore all page references to avoid staleelement reference exception
				MenuTabs_location=driver.findElement(By.xpath("(//div[@class='_3noxt'])[1]"));
				Tabs=MenuTabs_location.findElements(By.className("_2EGQY"));
		}
		
		
		
		
		
		
		
	}

}
