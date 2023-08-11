package findelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Restricted_Month_And_Dates_Inside_DatePicker {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		//Open Calendar
		WebElement Calendar=driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button"));
		Calendar.click();
		Thread.sleep(1000);
		
		By NextButton=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[3]/div[1]/div[1]/div[2]/*");
		while(true)
		{
			
			String RuntimeClass=driver.findElement(NextButton).getAttribute("class");
			if(RuntimeClass.contains("c-neutral-200"))
			{
				break;
			}
			driver.findElement(NextButton).click();
			Thread.sleep(1000);
		}
		

	}

}
