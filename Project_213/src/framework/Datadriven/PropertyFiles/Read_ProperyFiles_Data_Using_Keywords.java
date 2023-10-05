package framework.Datadriven.PropertyFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_ProperyFiles_Data_Using_Keywords {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		
	
		
		driver.get(Read_propertyFile.getProperty("application_url"));
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys(Read_propertyFile.getProperty("username"));
		

	}

}
