package mq.selenium.DataPicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selecting_Data_From_DatePicker 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		WebElement From=driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']"));
		From.sendKeys("SEC");
		
		Thread.sleep(5000);
		WebElement Station_Name=driver.findElement(By.xpath("//li[contains(.,'SECUNDERABAD JN - SC')]"));
		Station_Name.click();
		
		WebElement Calendar=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		//To Clear Text from editbox [Pressing Cntrl+A and Hit Backspace button]
		new Actions(driver).click(Calendar)
		.keyDown(Keys.CONTROL).sendKeys("A").sendKeys(Keys.BACK_SPACE).perform();
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].value='26/07/2023'", Calendar);
		
		
		
		
	}

}
