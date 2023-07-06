package capturescreen;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_Using_RobotClass {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Create object for robot and create screen using robot class
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(1020, 700));
		
		//Dump file into local folder
		File file=new File("F:\\02_June_2023_4-30PM\\Project_213\\screens\\HRM.png");
		ImageIO.write(image, "PNG", file);
	}

}
