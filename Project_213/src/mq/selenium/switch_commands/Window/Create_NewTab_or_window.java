package switch_commands.Window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewTab_or_window {

	public static void main(String[] args) {
		
		
		//Only Selenium 4 have this feature..
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Get Main Window ID
	    String FacebookID=driver.getWindowHandle();
	    
	    //Create New Tab at browser window
	    WebDriver Insta=driver.switchTo().newWindow(WindowType.TAB);
	    Insta.get("https://www.instagram.com/");
	    Insta.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    String InsatID=Insta.getWindowHandle();

	    WebElement Username=Insta.findElement(By.xpath("//input[@name='username']"));
	    Username.sendKeys("9030248855");
	    
	    Insta.switchTo().window(FacebookID);
	    System.out.println("Facebook Title is --> "+driver.getTitle());
	    
	    //Switch back to Instagram window
	    driver.switchTo().window(InsatID);
	    System.out.println(Insta.getTitle());
	}

}
