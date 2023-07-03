package mq.selenium.javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method_Using_JSExecutor {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript on automation browser
		WebElement SignInbutton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		
		//Default method
		//SignInbutton.click();
		
		//Click Using Mouse interactions class
		//new Actions(driver).click(SignInbutton).perform();
		
		//Enable Javascript Executor on Automatio browser
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Click on button using javascript executor
		js.executeScript("arguments[0].click()", SignInbutton);
		
		
		//Type Text using Javascript Executor
		js.executeScript("document.querySelector('#i0116').value='sunilreddy.gajjala@outlook.com'");
		
		//Click on Button Using javascript
		js.executeScript("document.querySelector('input[data-report-value='Submit']').click()");
	}

}
