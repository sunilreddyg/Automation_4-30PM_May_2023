package ui_verificationcommands.getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectangle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		WebElement RoundTrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
	
		//getRect() method capable of reading object [x,y,height,width]
		System.out.println(RoundTrip.getRect().getX());
		System.out.println(RoundTrip.getRect().getY());
		System.out.println(RoundTrip.getRect().getHeight());
		System.out.println(RoundTrip.getRect().getWidth());
		System.out.println(RoundTrip.getRect().getDimension());
		System.out.println(RoundTrip.getRect().getPoint());

	}

}
