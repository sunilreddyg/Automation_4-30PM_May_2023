package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Title {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    //Get Current Focused window id
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    //External Link --. Open Page at new window /TAB
	    WebElement Instagram=driver.findElement(By.linkText("Instagram"));
	    Instagram.click();
	    
	    //External Link --. Open Page at new window /TAB
	    WebElement MetaPay=driver.findElement(By.linkText("Meta Pay"));
	    MetaPay.click();
	    
	    //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
	    //Apply foreach to read all collection next value one after one
	    for (String EachWindow : AllWindowIDS) 
	    {
	    	//Switching to each window and capture window title
			String WindowTitle=driver.switchTo().window(EachWindow).getTitle();
			
			//Accept Condition when window title matching
			if(WindowTitle.contains("Error"))
			{
				break;  //Stop iteration when break command Executed [Ejecting from looping]
			}
		}
	    
	    //Here is the assumption when loop breakout it means your are at required window
	    System.out.println("Focused window title is --.>"+driver.getTitle());
	    

	}

}
