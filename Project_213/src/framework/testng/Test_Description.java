package framework.testng;

import org.testng.annotations.Test;

public class Test_Description 
{
	@Test(priority=2,description="Opening Chrome Browser")
	public void BrowserOpen()
	{
		
	}
	
	@Test(priority=0,description="Opening FB url")
	public void AppOpen()
	{
		
	}
	
	@Test(priority=1,enabled=false,description="Taking Screen")
	public void TakeScreen()
	{
		//Enabled property ignored test method to run
	}
}
