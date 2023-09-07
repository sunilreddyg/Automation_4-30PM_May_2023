package framework.testng;

import org.testng.annotations.Test;

public class IgnoreTest 
{
	

	@Test(priority=2)
	public void BrowserOpen()
	{
		
	}
	
	@Test(priority=0)
	public void AppOpen()
	{
		
	}
	
	@Test(priority=1,enabled=false)
	public void TakeScreen()
	{
		//Enabled property ignored test method to run
	}



}
