package ui_verificationcommands.getAttribute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_behaviours {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Testcase:-->
		 * 			Open makemytrip website
		 * 			And Check oneway trip is selected..
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(10000);
		
		WebElement OneWay=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String RuntimeClass=OneWay.getAttribute("class");
		
		if(!RuntimeClass.isEmpty()) //!--Not
		{
			if(RuntimeClass.equals("selected"))
				System.out.println("Testpass, As expected on browser launch oneway is selected");
			else
				System.out.println("Testfail, Onway trip is not selected");
		}
		else
		{
			System.out.println("Class Return Nothing, Testfail");
		}
		
		
		/*
		 * Assignment:-->
		 * Testcase:--> Select Roundtrip and then verify
		 * 				Round trip is Selected and also check
		 * 				oneway selection is off
		 */
		
		
		

	}

}
