package browser_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Chrome 
{

	public static void main(String[] args) 
	{
		
		//launching chrome browser and reffered to store into chromedriver class
		ChromeDriver chrome=new ChromeDriver();
		
		//Using browser reference loading webpage to browser window
		chrome.get("http://facebook.com");
		
		//Get title of the page
		String PageTitle=chrome.getTitle();
		System.out.println(PageTitle);
		
	
		//Close chrome browser
		chrome.close();
				
	}

}
