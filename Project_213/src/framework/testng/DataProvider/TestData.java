package framework.testng.DataProvider;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class TestData 
{
	
  WebDriver driver;
  WebDriverWait wait;
  String url="http://outlook.com";
  
  By SigninButton=By.xpath("(//a[contains(.,'Sign in')])[1]");
  By Email=By.xpath("//input[@id='i0116']");
  
  @BeforeSuite
  public void preConditions()
  {
	  driver=new ChromeDriver();
	  driver.get(url);
	  wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	  
	  driver.findElement(SigninButton).click();
  }
	
  @Test(dataProvider = "dp")
  public void TestEmailVerificaiton(String UID) throws Exception 
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
	  driver.findElement(Email).sendKeys(UID,Keys.ENTER);
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
	  driver.findElement(Email).clear();
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { "sunilreddy.gajjala@outlook.com"},
      new Object[] {"9030248855" },
      new Object[] {"gajjala.sunilreddy" },
      
    };
  }
  
    @DataProvider
    public Object[][] mobilenumbers() 
    {
      return new Object[][] {
        new Object[] { "9652680806"},
        new Object[] {"9030248855" },
        new Object[] {"9441213490" },
        
      };
    }
}
