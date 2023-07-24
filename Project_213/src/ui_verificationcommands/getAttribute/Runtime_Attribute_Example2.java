package ui_verificationcommands.getAttribute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute_Example2 {

	public static void main(String[] args) 
	{
		/*
		 * Testcase:-->
		 * 				step1:--> Open Makemytrip website
		 * 				Step2:--> Select Roundtrip radio button
		 * 				Step3:--> Verify double seat  fares is disabled 
		 */
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Selecting trip type roundtrip
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		
		WebElement DoubleSeatFares=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		String RuntimeClass=DoubleSeatFares.getAttribute("class");
		if(!RuntimeClass.isEmpty())
			System.out.println("Tespass, Double Seat fares is disabled");
		else
			System.out.println("Testfail, Double seat fares is enabeld");
		
	}

}
