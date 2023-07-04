package mq.selenium.javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HTML5_Video_Handlers {

	public static void main(String[] args) throws Exception {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--enable-javascript");
		options.addArguments("--use-fake-ui-for-media-stream=1");
		
		 WebDriver driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("http://www.w3.org/2010/05/video/mediaevents.html");
		 Thread.sleep(5000);
		 
		 //Enable Javascript executor on automatio browser
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 
		 WebElement Video=driver.findElement(By.id("video"));
		//play video
		 js .executeScript("arguments[0].play()",Video);
		 Thread.sleep(5000);
		  
		 //pause playing video 
		 js .executeScript("document.getElementById('video').pause()");
		 
		  
		 //check video is paused
		 System.out.println(js .executeScript("document.getElementById('video').paused"));
		 
		  
		 js .executeScript("document.getElementById('video').play()");
		  
		 // play video from starting
		 js .executeScript("document.getElementById('video').currentTime=0");
		 Thread.sleep(5000);
		  
		 //reload video
		 js .executeScript("document.getElementById('video').load()");

	}

}
