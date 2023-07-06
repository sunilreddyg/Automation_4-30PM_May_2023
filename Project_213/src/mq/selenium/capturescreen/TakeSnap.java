package capturescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TakeSnap {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		
		
		//Take Screen and convert into output file format
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create folder under project
		FileHandler.createDir(new File("screens"));
		//Copy file to folder 
		FileHandler.copy(file, new File("screens\\image.png"));
		
		
		
		/*
		 * PNG:--> [Portable network graphic] [Image Extension...]
		 * 
		 */
		
		
		
		
		
		
		
		
		

	}

}
