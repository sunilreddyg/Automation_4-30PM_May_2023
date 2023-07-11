package switch_commands.Window;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNew_Window {

	public static void main(String[] args) {
		
		//Only Selenium 4 have this feature..
		
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Get Main Window ID
	    String FacebookID=driver.getWindowHandle();
	    
	    //Create New Tab at browser window
	    WebDriver Insta=driver.switchTo().newWindow(WindowType.WINDOW);
	    Insta.get("https://www.instagram.com/");
	    Insta.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    String InsatID=Insta.getWindowHandle();
	    
	    
	    driver.switchTo().window(FacebookID);
	    System.out.println("Facebook Title is --> "+driver.getTitle());
	    
	    
	    

	}

}
