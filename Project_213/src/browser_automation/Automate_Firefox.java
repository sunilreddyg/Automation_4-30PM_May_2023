package browser_automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_Firefox {

	public static void main(String[] args) {
		
		//Launching firefox browser and storing into FirefoxDriver
		FirefoxDriver firefox=new FirefoxDriver();

		//Usning browser reference load wbepage
		firefox.get("http://gmail.com");
		
		//Printing page title 
		System.out.println(firefox.getTitle());
		System.out.println(firefox.getCurrentUrl());
		
		//Close browser window
		firefox.close();
	}

}
