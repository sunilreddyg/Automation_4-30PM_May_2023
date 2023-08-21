package objectidentification.classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identifying_With_Class_Property {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Identifying object with class property
		driver.findElement(By.className("oxd-input")).sendKeys("Admin");
		
		//Class Property with Xpath
		driver.findElement(By.xpath("//input[contains(@type,'password')]"))
		.sendKeys("admin123");
		
		//Identifying object with class name property
		driver.findElement(By.className("orangehrm-login-button")).click();

	}

}
