package mq.selenium.interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ElementTo_Target {

	public static void main(String[] args) 
	{
		
		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Identify document locations and Trash bin location..
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		WebElement TrashBin=driver.findElement(By.xpath("//div[@class='trash']"));
		
		
		
		//Create object for Actions class
		Actions action=new Actions(driver);
		
		//Dragging object to target using group of mouse interactions
		action.clickAndHold(Doc1).moveToElement(TrashBin).release().perform();
		action.clickAndHold(Doc2).moveToElement(TrashBin).release().perform();
		
		//Usig Direct Method drag object to required target
		action.dragAndDrop(Doc3, TrashBin).perform();
		action.dragAndDrop(Doc4, TrashBin).perform();
		
		
		
		
	

	}

}
