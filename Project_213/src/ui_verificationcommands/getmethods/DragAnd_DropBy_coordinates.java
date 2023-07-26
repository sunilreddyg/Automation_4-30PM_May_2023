package ui_verificationcommands.getmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnd_DropBy_coordinates {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement Slider1=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));
		//Get X coordinates of selected object
		int Early_Objx=Slider1.getLocation().getX();
		System.out.println("Before Obj x Coordinates are --> "+Early_Objx);
		
		//Drag object to Required Coordinates
		new Actions(driver).dragAndDropBy(Slider1, 200, 0).perform();
		
		
		int After_objx=Slider1.getLocation().getX();
		System.out.println("After Obj x coordinates are --> "+After_objx);
		
		if(After_objx > Early_Objx)
				System.out.println("Slider is Moving");
		else
			    System.out.println("Slider is not moving");
		
		
		//Sliding in back direction
		new Actions(driver).dragAndDropBy(Slider1, -100, 0).perform();
		
		System.out.println("After Sliding back Obj x Coordinates are --> "+Slider1.getLocation().getX());

	}

}
