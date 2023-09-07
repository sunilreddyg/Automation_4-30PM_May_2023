package framework.testng.DataProvider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvocationTest 
{
	
  @Test(invocationCount=10)
  public void f() 
  {
	  System.out.println("Test");
  }
  
  WebDriver driver;
  @BeforeClass
  public void SetupBrowser()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/reg");
	  driver.manage().window().maximize();
  }
  
  int count=0;
  @Test(invocationCount=12)
  public void SelectAllDrodownOptions()
  {
	 WebElement Month=driver.findElement(By.id("month"));
	 new Select(Month).selectByIndex(count);
	 
	 count=count+1;
	 
  }
  
  
  
  
}
