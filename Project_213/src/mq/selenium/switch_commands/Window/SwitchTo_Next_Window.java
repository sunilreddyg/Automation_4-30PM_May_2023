package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception {
		
		//Run This Program when ony two windows are opened
		
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://facebook.com");
			driver.manage().window().maximize();
				
			//Capture Active browser window ID
			String MainWindowId=driver.getWindowHandle();
			System.out.println(MainWindowId);
				
			System.out.println("Befor switch--->  "+driver.getTitle());
				
				
			WebElement Instagram=driver.findElement(By.linkText("Instagram"));
			Instagram.click();
			Thread.sleep(10000);
				
			//Get All window ID's
			Set<String> AllWindowIds=driver.getWindowHandles();
			//Applying foreach loop to read all collection values
			for (String EachwindowID : AllWindowIds) 
			{
				driver.switchTo().window(EachwindowID);
			}
			
			//Here is the assumption when looping is finished by default controls presented at second window
			System.out.println("Second Window Title is --> "+driver.getTitle());

			
			//Switch back to Mainwindow
			driver.switchTo().window(MainWindowId);
			System.out.println("Homepage title is --> "+driver.getTitle());
			
			

	}

}
