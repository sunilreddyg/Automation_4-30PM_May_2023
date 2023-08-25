package pageobjects.WithPageFactory.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.WithPageFactory.Pages.HRM_Login;
import pageobjects.WithPageFactory.Pages.MenuTabs;
import pageobjects.WithPageFactory.Pages.PIM_AddEmployee;


public class PIM_Tests 
{
	WebDriver driver;
	HRM_Login login;
	MenuTabs tabs;
	PIM_AddEmployee pim;
	public PIM_Tests(WebDriver driver)
	{
		this.driver=driver;
		login=new HRM_Login(driver);
		tabs=new MenuTabs(driver);
		pim=new PIM_AddEmployee(driver);
		
	}
	
	public void Add_Valid_EmployeeDetails()
	{
		try {
			login.Userlogin("Admin","admin123");
			Thread.sleep(2000);
			
			tabs.pIM.click();
			Thread.sleep(2000);
			
			pim.addEmployee.click();
			Thread.sleep(2000);
			
			pim.AddNewEmplyeeDetails("Sunil", "Kumar", "S", "100");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Add_InValid_EmployeeDetails()
	{
		try {
			login.Userlogin("Admin","admin123");
			Thread.sleep(2000);
			
			tabs.pIM.click();
			Thread.sleep(2000);
			
			pim.addEmployee.click();
			Thread.sleep(2000);
			
			pim.AddNewEmplyeeDetails("", "Kumar", "S", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
