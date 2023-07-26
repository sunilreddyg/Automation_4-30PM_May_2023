package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_InputFrom_Textbox {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		

		//Typing email into textbox
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Darshan");
		Thread.sleep(10000);
		
		//Method usefull only to read input from editbox
		String Runtime_value=email.getAttribute("value");
		System.out.println(Runtime_value);
		
		if(!Runtime_value.isEmpty())
			System.out.println("Editbox is not empty");
		else
			System.out.println("Editbox is empty");

	}

}
