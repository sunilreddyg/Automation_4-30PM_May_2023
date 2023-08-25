package pageobjects.WithPageFactory.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.WithPageFactory.Pages.ContactDetails;
import pageobjects.WithPageFactory.Pages.HRM_Login;
import pageobjects.WithPageFactory.Pages.MenuTabs;
import pageobjects.WithPageFactory.Pages.PersonalDetails;


public class Testfor_ContactDetails 
{
	WebDriver driver;
	HRM_Login login;
	MenuTabs menu;
	PersonalDetails pdetails;
	ContactDetails cdetails;
	
	public Testfor_ContactDetails(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_Login(driver);
		menu=new MenuTabs(driver);
		pdetails=new PersonalDetails(driver);
		cdetails=new ContactDetails(driver);
	}
	
	
	public void AddContactdetails()
	{
		login.Userlogin("Admin", "admin123");
		menu.clickmyinfo();
		pdetails.clickcontactDetails();
		cdetails.enterstreet1details();
		cdetails.enterstree2details();
	}
	
	
	

}
