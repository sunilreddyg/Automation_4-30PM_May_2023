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


public class PersonalDetails
{

	WebDriver driver;
	public PersonalDetails(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//a[contains(.,'Personal Details')]")
	public WebElement  personalDetails;
	
	@FindBy(xpath = "//a[contains(.,'Contact Details')]")
	public WebElement  contactDetails;
	
	@FindBy(xpath = "//a[contains(.,'Emergency Contacts')]")
	public WebElement  emergencyContacts;
	
	@FindBy(xpath = "//a[contains(.,'Dependents')]")
	public WebElement  dependents;
	
	@FindBy(xpath = "//a[contains(.,'Immigration')]")
	public WebElement  immigration;
	
	@FindBy(xpath = "//a[contains(.,'Job')]")
	public WebElement  job;
	
	@FindBy(xpath = "//a[contains(.,'Salary')]")
	public WebElement  salary;
	
	@FindBy(xpath = "//a[contains(.,'Tax Exemptions')]")
	public WebElement  taxExemptions;
	
	
	
	
	
	public void clickcontactDetails()
	{
		CheckObjectVisibility(contactDetails).click();
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

}