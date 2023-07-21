package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextPresented_At_WebPage {

	public static void main(String[] args) throws Exception 
	{
		
		
	
		/*
		 * Scenario:  Verify Error label presented when use missed any input entry
		 * 		Given site url is "http://facebook.com/reg"
		 * 		When User Click Signup Button without Enter Details 
		 * 		Then verify error lable displayed "What's your name?"
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement Signup_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		Signup_btn.click();
		Thread.sleep(3000);
		
		
		//Identify Webpage
		WebElement Page=driver.findElement(By.tagName("body"));
		String PageVisibleText=Page.getText();
		System.out.println(PageVisibleText);
		
		if(PageVisibleText.contains("What's your name?"))
			System.out.println("Expected Label Visible at webpage");
		else
			System.out.println("Expected label not visible at webpage");
		
		

	}

}
