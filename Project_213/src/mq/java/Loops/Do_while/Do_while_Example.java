package mq.java.Loops.Do_while;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_while_Example {

	public static void main(String[] args)
	{
		
		//Print Numbers 1 to 10
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i<11);
		
		
		
		//Do with false condition
		int j=0;
		do {
			System.out.println(j);
		} while (j > 10);
		
		
		//Browser launch code
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		boolean flag=false;
		do {
			driver.get("https://instagram.com");
			try {
				flag=wait.until(ExpectedConditions.titleContains("Instagram"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (flag!=true);
		
		System.out.println("Instagram Page title verified");
		
		
		
		
		
		
		
		
		
		

	}

}
