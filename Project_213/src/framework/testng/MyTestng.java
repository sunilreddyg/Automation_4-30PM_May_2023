package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng 
{
  @Test //Invoke method to run without object creation and main method
  public void tc001() 
  {
	  Reporter.log("Browser Is up",true);
  }
  
  
  @Test //Invoke method to run without object creation and main method
  public void tc002() 
  {
	  Reporter.log("Loading webpage");
  }
  
  @Test //Invoke method to run without object creation and main method
  public void tc003() 
  {
	  Reporter.log("Valid Entry login",true);
  }
  
}
