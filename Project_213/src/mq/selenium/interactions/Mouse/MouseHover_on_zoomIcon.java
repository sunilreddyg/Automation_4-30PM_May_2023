package mq.selenium.interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_on_zoomIcon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		
		
		//Move Cursor at Required location and press Mouse on it..
		WebElement Image=driver.findElement(By.xpath("//a[@title='Dynamic Image Zoom Plugin with Run Time Toggle - Hover-Zoom Extended']"));
		new Actions(driver).moveToElement(Image).pause(2000).click().perform();

	}

}
