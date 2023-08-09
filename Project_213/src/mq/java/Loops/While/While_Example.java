package mq.java.Loops.While;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		//print number 1 to 10 using while loop
		
		int i=1;
		while(i <= 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//Printing numbers 10 to 1 using while loop
		int j=10;
		while (j > 0) 
		{
			System.out.println(j);
			j=j-1;
		}
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

		WebElement StateDropdown=driver.findElement(By.xpath("//select[@name='stateName']"));
		new Select(StateDropdown).selectByIndex(4);
		
		WebElement CityDropdown = null;
		try {
			CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		  int count=0;
		  while(!CityDropdown.isEnabled()) 
		  {
			  	
			  	Thread.sleep(1000);
			  	if(count==20)
			  	{
			  		break;  //Jump Condition
			  	}
			  	count=count+1;
		  }
		 
		new Select(CityDropdown).selectByIndex(2);
		
		
		
		
	}

}
