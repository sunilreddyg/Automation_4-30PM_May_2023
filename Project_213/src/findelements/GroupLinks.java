package findelements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroupLinks 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");   
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement TrendingList=driver.findElement(By.xpath("//div[@id='trending-naukri-wdgt']"));
		List<WebElement> Alltabs=TrendingList.findElements(By.className("ntc__chip-wrapper"));
		System.out.println(Alltabs.size());
		
		String Mainwindow=driver.getWindowHandle();
		for (int i = 0; i < Alltabs.size(); i++) {
			
			//Get Each element using index number
			WebElement EachTab=Alltabs.get(i);
			new Actions(driver).scrollToElement(EachTab).perform();
			
			//Read Linkname and Linkhref
			String Linkname=EachTab.getText();
			String linkhref=EachTab.getAttribute("href");
			
			EachTab.click();
			Thread.sleep(2000);
			
			//switch to second window..
			Set<String> Allwindows=driver.getWindowHandles();
			for (String Eachwindow : Allwindows) 
			{
				driver.switchTo().window(Eachwindow);
			}
			
			
			if(driver.getCurrentUrl().contains(linkhref))
			{
				System.out.println(Linkname+"--->Url Verified");
			}
			else
			{
				System.out.println(Linkname+"  ---> Url mismatched  ");
			}
			
			//Close sigle window
			driver.close();
			
			//Switch back to mainwidow
			driver.switchTo().window(Mainwindow);
		}
		
		
		
		
		
		
	}

}
