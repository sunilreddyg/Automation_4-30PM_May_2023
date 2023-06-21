package mq.selenium.Link;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Using_get_Method {

	public static void main(String[] args) 
	{
		
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		driver.get("https://about.meta.com/");

	}

}
