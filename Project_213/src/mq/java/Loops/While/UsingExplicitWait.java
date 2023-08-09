package mq.java.Loops.While;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) throws Exception {
		
		
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
		
		//Using Explicitwait wait for until object get Enabled status..
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(CityDropdown));
		new Select(CityDropdown).selectByIndex(3);
		
		
		

	}

}
