package commonLibrary;

import org.openqa.selenium.WebDriver;

public class Run_CommonActions {

	public static void main(String[] args) 
	{
		
		CommonActions action=new CommonActions();
		action.setup("chrome", "http://facebook.com");
		
		//Getting browser driver reference from commactions class
		WebDriver driver=action.getDriver();
		System.out.println(driver.getTitle());
		
		//Enter login details
		action.typetext("//input[@id='email']", "Admin");
		action.typekeys("//input[@id='pass']", "admin123");
		
		//Click Signup Now link
		action.ClickElemnet("//a[@href='/reg/']");
		action.selectdropdownoption("//select[@id='day']", "18");
		action.selectoptions("//select[@id='month']", "index", "10");
		action.CaptureScreen("MontSelection");
	}

}
