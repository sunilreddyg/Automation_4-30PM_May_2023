package commonLibrary;


import org.junit.Test;

public class Run_Keywords extends CommonActions
{
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test
	public void test() 
	{
		setup("firefox", url);
		System.out.println(driver.getTitle());
		typetext("//input[@name='username']", "Admin");
		typekeys("//input[@type='password']", "admin123");
		typewithjs("//input[@type='password']", "dsfsdfdsfdfdfdfdsf");
	}

}
