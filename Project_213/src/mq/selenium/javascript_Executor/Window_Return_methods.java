package mq.selenium.javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Return_methods {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//enable  javascript executor on automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Return title of current window
		System.out.println(driver.getTitle());
		String WindowTitle=js.executeScript("return document.title").toString();
		System.out.println(WindowTitle);
		
		//Return Current url
		System.out.println(driver.getCurrentUrl());
		String url=js.executeScript("return location.href").toString();
		System.out.println(url);
		
		
		//Return browser protocal
		String protocal=js.executeScript("return location.protocol").toString();
		System.out.println(protocal);
		
		
		//Return Cookies enabled
		String st=js.executeScript("return navigator.cookieEnabled").toString();
		System.out.println(st);
		
		
		//Return Cookies enabled
		String st1=js.executeScript("return navigator.platform").toString();
		System.out.println(st1);
		
		

		

	}

}
