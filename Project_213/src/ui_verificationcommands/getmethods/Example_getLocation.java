package ui_verificationcommands.getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getLocation {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		WebElement SignInButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
	
		int Obj_xCoordinates=SignInButton.getLocation().getX();
		System.out.println("Object Presented at X Coordinates ---. "+Obj_xCoordinates);
		
		//Read Automation window width
		int Window_Width=driver.manage().window().getSize().getWidth();
		if(Obj_xCoordinates >  Window_Width/2)
			System.out.println("Object Presented at right side of the page");
		else
			System.out.println("Object Not Presented at right side of the page");
		
		//How to Verify object visible at webpage
		if(SignInButton.getLocation().getX() > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object hidde at webpage");


	}

}
