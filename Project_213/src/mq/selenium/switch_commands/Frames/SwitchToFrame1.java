package switch_commands.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\software dump\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement FrameLocation=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(FrameLocation);
		
		WebElement Calendar=driver.findElement(By.id("datepicker"));
		Calendar.click();
		
		WebElement Date=driver.findElement(By.linkText("21"));
		Date.click();
		
		//Get Controls back to webpage
		driver.switchTo().defaultContent();
		
		WebElement Demo=driver.findElement(By.xpath("//a[@href='https://jqueryui.com/demos/']"));
		Demo.click();
		
		
	}

}
