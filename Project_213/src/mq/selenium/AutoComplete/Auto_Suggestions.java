package mq.selenium.AutoComplete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Login into HRM Account
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    
	    WebElement PIM=driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(2) .oxd-text"));
	    PIM.click();
	   
	    Thread.sleep(2000);   //Static time to wait for Required Page obejct to load
	    //Typing referal name into auto complete editbox
	    WebElement EmployeeName=driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
	    EmployeeName.sendKeys("Alice  Duval");
	    
	    //Clicking at one of suggesstions
	    WebElement Employee=driver.findElement(By.xpath("//span[contains(.,'Alice  Duval')]"));
	    Employee.click();
	}

}
