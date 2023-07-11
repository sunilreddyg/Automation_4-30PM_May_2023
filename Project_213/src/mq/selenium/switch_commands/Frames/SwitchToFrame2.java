package switch_commands.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame2 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\software dump\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/info/redcare");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		WebElement FrameElement=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(FrameElement);
		
		WebElement mobile=driver.findElement(By.id("mobileNoInp"));
		mobile.sendKeys("9652680806");
		
	}

}
