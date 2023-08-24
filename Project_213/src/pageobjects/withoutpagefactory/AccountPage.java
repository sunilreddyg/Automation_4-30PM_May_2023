package pageobjects.withoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage 
{
	WebDriver driver;
	String ExpHeader="Dashbaord";
	public AccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	public static By AccountImage=By.xpath("//img[@class='oxd-userdropdown-img']");
	public static By Dashboard=By.xpath("//h6[contains(.,'Dashboard')]");
	public static By logout=By.xpath("//a[@href='/web/index.php/auth/logout']");
	
	
	public boolean verifyloginSuccessful()
	{
		boolean flag=false;
		try {
			 new WebDriverWait(driver, Duration.ofSeconds(20))
			.until(ExpectedConditions.visibilityOfElementLocated(AccountImage));
			 flag=true;
		} catch (Exception e) {
			
		}
		return flag;
	}
	
	public boolean verifyHeaderPresented()
	{
		boolean flag=false;
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.textToBePresentInElementLocated(Dashboard, ExpHeader));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public void userlogout()
	{
		driver.findElement(AccountImage).click();
		try {
			 new WebDriverWait(driver, Duration.ofSeconds(20))
			.until(ExpectedConditions.visibilityOfElementLocated(logout)).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
