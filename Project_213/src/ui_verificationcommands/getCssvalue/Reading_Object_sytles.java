package ui_verificationcommands.getCssvalue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Reading_Object_sytles 
{

	public static void main(String[] args) 
	{
		
		
		//Only selenium 4 have this feature
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		String Hex_color="#00a400";
		
		//Note:--> Selenium read color and background color in RGBA format[Red Green Blud Alpha]
		WebElement Button=driver.findElement(By.name("websubmit"));
		String Act_color=Button.getCssValue("background-color");
		System.out.println(Act_color);
		
		
		//Convertin HEX format into RGBA format
		Color Hexcolor=Color.fromString(Hex_color);
		String Exp_RBGA_ColorCode=Hexcolor.asRgba();
		
		
		if(Act_color.equals(Exp_RBGA_ColorCode))
			System.out.println("Color matching");
		else
			System.out.println("Color mismatched");
		
		
		/*
		 * For more details refer
		 * 	https://www.selenium.dev/documentation/webdriver/support_features/colors/
		 */
		

	}

}
