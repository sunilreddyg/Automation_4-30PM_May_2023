package pageobjects.WithPageFactory.Example;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FbSignup 
{
	
	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstname;
	
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Surname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement email;
	
	@FindBy(xpath = "//select[@id='day']")
	public WebElement DOB_day;
	
	@FindBy(xpath = "//select[@id='month']")
	public WebElement DOB_Month;
	
	@FindBy(xpath = "//select[@id='day']/option")
	public List<WebElement> DOB_AllMonths;
	
	
	public void enterfirstname(String name)
	{
		firstname.sendKeys(name);
	}

	public void enterSurname(String name)
	{
		Surname.sendKeys(name);
	}
	
	public void enteremail(String emailinput)
	{
		email.sendKeys(emailinput);
	}
	
	public void selectdate(String date)
	{
		new Select(DOB_day).selectByVisibleText(date);
	}
	
	public void SelectMonth(String monthname)
	{
		new Select(DOB_Month).selectByVisibleText(monthname);
	}
	
	public void VerifyMonthOptionsCount()
	{
		if(DOB_AllMonths.size()==12)
			System.out.println("TestPass");
		else
			System.out.println("TestFail");
	}
	
	
	public void userregistration(String fname,String sname,String email,String day,String month)
	{
		enterfirstname(fname);
		enterSurname(sname);
		enteremail(email);
		selectdate(day);
		SelectMonth(month);
	}
	
	public void registrationwithoutemail(String fname,String sname,String day,String month)
	{
		enterfirstname(fname);
		enterSurname(sname);
		enteremail("");
		selectdate(day);
		SelectMonth(month);
	}
	
	
	
	
	
}
