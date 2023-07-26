package ui_verificationcommands.getAttribute;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox_Readonly {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Convert editbox into readonly mode
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').setAttribute('readonly','readonly')");
		Thread.sleep(4000);

	
		WebElement email=null;
		boolean flag=false;
		try {
			email=driver.findElement(By.id("email"));
			email.sendKeys("Darshan");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Element not found at source");
		}
		
		//Read input from editbox
		if(email!=null)
		{
			String input=email.getAttribute("value");
			if(input.isEmpty())
				System.out.println("No Input Presented at editbox");
			else
				System.out.println("Input presented at editbox");
		}
		else
		{
			System.out.println("Element available at invalid state");
		}
		
		

	}

}
