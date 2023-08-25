package pageobjects.WithPageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class ContactDetails
{
	WebDriver driver;
	public ContactDetails(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


	@FindBy(xpath = "//h6[contains(.,'Contact Details')]")
	public WebElement  contactDetailsHeader;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement  Street1;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement  Street2;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	public WebElement  City;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	public WebElement  State;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	public WebElement  ZipCode;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	public WebElement  CountryDropdown;
	
	@FindBy(xpath = "//div[@role='option'][contains(.,'Italy')]")
	public WebElement  CountryName;

	@FindBy(xpath = "(//input[@modelmodifiers='[object Object]'])[1]")
	public WebElement Home;
	
	
	
	public void enterstreet1details()
	{
		CheckObjectVisibility(Street1).sendKeys("ChaitanyaPuri");
		
	}
	
	
	public void enterstree2details()
	{
		CheckObjectVisibility(Street2).sendKeys("Dilsukhnagar");
	}

	
	public WebElement CheckObjectVisibility(WebElement element)
	{
		try {
			return new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public void capturescreen(String screename)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("Screens\\"+screename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}