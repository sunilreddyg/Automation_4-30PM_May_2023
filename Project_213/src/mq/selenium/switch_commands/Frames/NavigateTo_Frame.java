package switch_commands.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo_Frame {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software dump\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Navigate to frame
		Thread.sleep(5000);
		driver.navigate().to("https://jqueryui.com/resources/demos/datepicker/default.html");
		
		
		WebElement Calendar=driver.findElement(By.id("datepicker"));
		Calendar.click();
		
		WebElement Date=driver.findElement(By.linkText("21"));
		Date.click();
		
		//Navigate Back to Previous page
		Thread.sleep(3000);
		driver.navigate().back();

	}

}
