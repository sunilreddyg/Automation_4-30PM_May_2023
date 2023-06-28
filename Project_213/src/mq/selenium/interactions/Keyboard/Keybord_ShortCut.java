package mq.selenium.interactions.Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybord_ShortCut {

	public static void main(String[] args) {
		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.jqueryscript.net/demo/keyboard-shortcut-handling/");
		   driver.manage().window().maximize();
		   
		   
		   //Press Contrl down and press F1 Key
		   new Actions(driver).keyDown(Keys.ALT).sendKeys(Keys.F1).perform();
			
			//Press Escape key
		   new Actions(driver).pause(4000).sendKeys(Keys.ESCAPE).perform();

	}

}
