package ui_verificationcommands.getAttribute;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading_date_From_Editbox {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/flights?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement DateElement=driver.findElement(By.xpath("//input[@data-rome-id='0']"));
		String Act_Date=DateElement.getAttribute("value");
		System.out.println(Act_Date);
		
		//Get Current System date
		Date d=new Date();
		System.out.println(d.toString());
		//Create simpel date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd MMM, EEE");
		//Converted date using simple date formatter
		String Exp_Date=sdf.format(d);
		System.out.println(Exp_Date);
		
		


	}

}
