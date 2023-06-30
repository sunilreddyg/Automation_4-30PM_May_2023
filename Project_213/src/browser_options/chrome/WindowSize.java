package browser_options.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSize {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--new-window");
		options.addArguments("--window-size=400,600");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");

	}

}
