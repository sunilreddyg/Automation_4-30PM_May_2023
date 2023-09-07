package framework.testng.Groups;

import org.testng.annotations.Test;

public class TestSuite1 
{
  @Test(groups= {"reg1","reg2"})
  public void tc001() 
  {
	  System.out.println("tc001 executed");
  }
  
  @Test(groups="reg2")
  public void tc002() 
  {
	  System.out.println("tc002 executed");
  }
  
  
  @Test(groups="reg1")
  public void tc003() 
  {
	  System.out.println("tc003 executed");
  }
  
  
 
  
}
