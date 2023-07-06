package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenWith_Time_Stamp 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE dd-hh-mm-ss");
		//Get System Current Date
		Date d=new Date();
		//Convert Current date into required format
		String time=sdf.format(d);
		
		
		//Selected Entire page and take screen shot
		WebElement Page=driver.findElement(By.tagName("body"));
		File file2=Page.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file2, new File("screens\\image"+time+".png"));   //Concat time  to image name

		
		/*
		 * yyyy    [2001-2023] 
		 * yy      [01-23]
		 * MM      [01-12]    Month in Digits
		 * MMM	   [Jan-Dec]  Mmonth name
		 * EEE     [Mon-Sun]  Week name
		 * dd      [01-31]    date in digits
		 * mm      [01-60]    minutes in digits
		 * hh      [01-24]    hours in digits
		 * ss      [01-60]    seconds in digits
		 */
		
		
		
		
		
		

	}

}
