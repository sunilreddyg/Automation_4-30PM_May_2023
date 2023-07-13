package commonLibrary;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonActions 
{
	
	WebDriver driver=null;
	String screenpath="F:\\02_June_2023_4-30PM\\Project_213\\screens\\";
	String MainwindowId;
	/*
	 * Keyword:--> Launch browsers [Chrome and Firefox]
	 */
	public void LaunchBrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Browser name mismatched");
		}
		
	}
	
	
	/*
	 * Keyword:--> Load Webpage
	 */
	public void loadwebpage(String url)
	{
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	/*
	 * Keyword:--> Launch Browser and load webpage
	 */
	public void setup(String browser,String url)
	{
		LaunchBrowser(browser);
		loadwebpage(url);
	}
	
	
	/*
	 * Keyword:--> get browser driver
	 */
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	/*
	 * Keyword:--> Type text into editbox
	 */
	public void typetext(String xpath,String input)
	{
		try {
			driver.findElement(By.xpath(xpath)).sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/*
	 * Keyword:--> Type text into editbox using keyboard interaction class
	 */
	public void typekeys(String xpath,String input)
	{
		try {
			WebElement Element=driver.findElement(By.xpath(xpath));
			new Actions(driver).sendKeys(Element, input).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Keyword:--> Type text into editbox using keyboard interaction class
	 */
	public void typewithjs(String xpath,String input)
	{
		try {
			WebElement Element=driver.findElement(By.xpath(xpath));
			((JavascriptExecutor)driver).executeScript("arguments[0].value="+"/+input+/", Element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Left Mouseclick actions[Suites for Buttons,Links,RadioButton,
	 * Checkbox,Tabs,ListofItems]
	 */
	public void ClickElemnet(String xpath)
	{
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Right Click actions[Suites for Buttons,Links,RadioButton,
	 * Checkbox,Tabs,ListofItems]
	 */
	public void RightClickAt(String xpath)
	{
		try {
			WebElement Element=driver.findElement(By.xpath(xpath));
			new Actions(driver).contextClick(Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * MouseHover on any selected location
	 */
	public void MouseMove(String xpath)
	{
		try {
			WebElement Element=driver.findElement(By.xpath(xpath));
			new Actions(driver).moveToElement(Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * ScrollElemeent to View [ByDefault Elements shows at page Bottom]
	 */
	public void ViewElement(String xpath)
	{
		try {
			WebElement Element=driver.findElement(By.xpath(xpath));
			new Actions(driver).scrollToElement(Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * ScrollElemeent to View [Required Element available at Top View port]
	 */
	public void ViewElementtoTop(String xpath)
	{
		try {
			WebElement Element=driver.findElement(By.xpath(xpath));
			 int ObjY=Element.getRect().y;
			 new Actions(driver).scrollByAmount(0, ObjY).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//Select Dropdown option using OptinName [Suites for Select Tag Elements]
	//This method ony works with visible text option only
	public void selectdropdownoption(String xpath,String optionname)
	{
		try {
			new Select(driver.findElement(By.xpath(xpath)))
			.selectByVisibleText(optionname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Select Dropdown option using OptinName [Suites for Select Tag Elements]
	//selecttype  [text/value/index]
	public void selectoptions(String xpath,String selecttype,String option)
	{
		WebElement drodpown=driver.findElement(By.xpath(xpath));
		
		switch (selecttype) {
		case "text":
			new Select(drodpown).selectByVisibleText(option);
			break;
			
		case "value":
			new Select(drodpown).selectByValue(option);
			break;

		case "index":
			int index=Integer.parseInt(option);  //Convert String value into integer
			new Select(drodpown).selectByIndex(index);
			break;
		default:
			break;
		}
	}
	
	
	//CaptureScreen along with imagename and unique time stamp
	//It capture Entire View Port
	public void CaptureScreen(String Imagename)
	{
		String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//CaptureScreen at location
	public void CaptureScreenAt(String ElementXpath,String Imagename)
	{
			String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=driver.findElement(By.xpath(ElementXpath)).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Switch to second window
	public void SwitchToNextWindow()
	{
		MainwindowId=driver.getWindowHandle();
		 //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
	}
	
	//Switch back to mainwindow
	public void GetbacktoMainwindow()
	{
		driver.switchTo().window(MainwindowId);
	}
	
	

}
