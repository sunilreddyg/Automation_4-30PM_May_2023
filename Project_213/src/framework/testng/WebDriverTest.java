package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class WebDriverTest 
{
	
  WebDriver driver;
  WebDriverWait wait;
  
    @Test
	public void Tc001_VerifySignupPage()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals
		("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup page title verified");
	}
	
	@Test
	public void Tc002_VerifyLoginPage()
	{
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals
		("Log in to Facebook", driver.getTitle());
		System.out.println("Login page title verified");
	}
	
	@Test
	public void Tc003_VerifyMessengerPage()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals
		("Messenger", driver.getTitle());
		System.out.println("Messenger title verified");
	}
	
	
	@Test
	public void Tc004_VerifyFacebookLite()
	{
		driver.findElement(By.linkText("Facebook Lite")).click();
		Assert.assertEquals("Facebook Lite APK for Android", driver.getTitle());
		System.out.println("Facebook Lite title vefied");
	}
  
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get("http://facebook.com");
  }

  @AfterMethod
  public void afterMethod(Method method) 
  {
	  try {
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File("screens\\"+method.getName()+".png"));
	} catch (Exception e) {
		// TODO: handle exception
	}
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver=new ChromeDriver();
	   wait=new WebDriverWait(driver,Duration.ofSeconds(30));
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
