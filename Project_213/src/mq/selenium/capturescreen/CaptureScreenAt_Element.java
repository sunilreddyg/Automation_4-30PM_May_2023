package capturescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenAt_Element 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		//Only selenium 4+ have this feature
		//Capturing screen at selected location
		WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		File file=Username.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("screens\\image1.png"));
		
		//Selecting Entire login form and Capture Screen
		WebElement Form=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']"));
		File src=Form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\image2.png"));
		
		
		//Selected Entire page and take screen shot
		WebElement Page=driver.findElement(By.tagName("body"));
		File file2=Page.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file2, new File("screens\\image3.png"));
		
	}

}
