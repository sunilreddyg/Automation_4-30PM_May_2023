package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
	
 
  @BeforeClass //Invoke Before first @Test
  public void beforeClass() 
  {
	  System.out.println("Class Precondition");
  }

  @AfterClass //Invoke after last @Test
  public void afterClass() 
  {
	  System.out.println("Class PostCondition");
  }
  
  @Test
  public void test1() 
  {
	  Reporter.log("Test1 executed",true);
  }
  
  
  @Test
  public void test2() 
  {
	  Reporter.log("Test2 executed",true);
  }
  

}
