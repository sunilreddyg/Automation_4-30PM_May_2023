package mq.selenium.AutoComplete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Item_From_SuggestionList 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/autocomplete/remote.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Birds=driver.findElement(By.id("birds"));
		Birds.sendKeys("Ja");
		
		WebElement Birdname=driver.findElement(By.xpath("//div[@tabindex='-1'][contains(.,'Jack Snipe')]"));
		Birdname.click();
		
		
		
		
	}

}
