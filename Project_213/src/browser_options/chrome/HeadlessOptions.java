package browser_options.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessOptions {

	public static void main(String[] args) 
	{

				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				
				
				WebDriver driver=new ChromeDriver(options);
				driver.get("http://facebook.com");
				System.out.println(driver.getTitle());
				
				WebElement Email=driver.findElement(By.id("email"));
				if(Email.isDisplayed())
					System.out.println("Element Visible");
				else
					System.out.println("Element is hidden");
				

	}

}
