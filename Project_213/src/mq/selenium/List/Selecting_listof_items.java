package mq.selenium.List;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_listof_items {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		//Step1:--> Click Mouse action to open list of items
		driver.findElement(By.linkText("Select Product Type")).click();
		
		//Step2:--> Click one of option from list using click method
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
		
		
		//Step1:
		driver.findElement(By.linkText("Select Product")).click();
		//Step2
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'SmartEMi')]")).click();
		
		
		
		
		
	}

}
