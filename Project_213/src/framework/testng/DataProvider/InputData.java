package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp",enabled=false)
  public void testmobileprices(String mobilename,double price) 
  {
	  System.out.println(mobilename+"   "+price);
  }
  
  
  //Set method parameter accorind to dataprovider class
  @Test(dataProvider="config")
  public void getinfo(String name,String config,int quantity,boolean status) 
  {
	  
  }
  
  

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"iphone",75000.00},
      new Object[] {"Samsung",55000.00},
      new Object[] {"Oneplus",45000.00},
      new Object[] {"Vivo",35000.00},
    };
  }
  
  
  @DataProvider
  public Object[][] config() 
  {
    return new Object[][] 
    {
      new Object[] {"iphone","32GB",1,true},
      new Object[] {"Samsung","64GB",2,false},
      new Object[] {"Oneplus","128GB",0,false},
      new Object[] {"Vivo","32GB",4,true},
    };
  }
}
