package switch_commands.Window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SecondWindow {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		System.out.println("Current Window Title :-->"+driver.getTitle());
		
		
		WebElement Meta=driver.findElement(By.linkText("Meta"));
		Meta.click();
		Thread.sleep(10000);
		
		//Get All Window Id's 
		Set<String> AllWindowIds=driver.getWindowHandles();
		
		//Convert Set of Strings into Iteratables
		Iterator<String> itr=AllWindowIds.iterator();
		
		//Read Each Iterator using Next Keyword
		String Window1=itr.next();
		String Window2=itr.next();
		
		driver.switchTo().window(Window2);
		System.out.println("Current Window Title :-->"+driver.getTitle());
		driver.close();    //Only Close Focused window
		
		driver.switchTo().window(Window1);
		System.out.println("Homepage Title is --> "+driver.getTitle());
	}

}
