package robot_java_Automation_tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_popups 
{
	public static void main(String[] args) throws AWTException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		//Move mouse pointer to required locatio using  x and y cooridinates
		robot.mouseMove(308, 165);
		
		//Press Down mouse key and Release it..
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		/*
		 * Sample Website
		 * https://the-internet.herokuapp.com/
		 */
		
	}

}
