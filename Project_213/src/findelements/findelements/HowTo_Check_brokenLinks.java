package findelements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowTo_Check_brokenLinks {

	public static void main(String[] args) 
	{
		String homePage = "https://www.facebook.com/reg/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		
		
		//Browser launching code
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);
		
		WebElement FooterArea=driver.findElement(By.id("pageFooterChildren"));
		List<WebElement> links = FooterArea.findElements(By.tagName("a"));
		
		//Converting links into independent tokens
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext())
		{
		
				WebElement EachLink= it.next();
				//Reading each link href
				url=EachLink.getAttribute("href");
		
				if(url == null || url.isEmpty())
				{
					System.out.println("URL is either not configured for anchor tag or it is empty");
					continue;
				}
		
				/*
				 * if(!url.startsWith(homePage)) {
				 * System.out.println("URL belongs to another domain, skipping it."); continue;
				 * }
				 */
		
				
			try {
			
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				System.out.println(respCode);
			
				if(respCode >= 400)
				{
					System.out.println(url+" is a broken link");
				}
				else
				{
					System.out.println(url+" is a valid link");
				}
			
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
			
			driver.quit();

	}

}
