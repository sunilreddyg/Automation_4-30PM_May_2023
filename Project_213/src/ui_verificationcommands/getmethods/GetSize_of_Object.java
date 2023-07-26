package ui_verificationcommands.getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_of_Object {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement BookADemo=driver.findElement(By.xpath("//a[@href='/hris-hr-software-demo/']"));
		
		//Get Object height and width
		int Obj_Height=BookADemo.getSize().getHeight();
		int Obj_width=BookADemo.getSize().getWidth();
		
		
		System.out.println("Object Height is --> "+Obj_Height);
		System.out.println("Object width is --> "+Obj_width);
		
		//Check object is visble at webpage
		//for hidden object selenium return height and width zero 
		if(Obj_Height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object not visible at webpage");
		
		
	}

}
