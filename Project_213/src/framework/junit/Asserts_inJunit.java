package framework.junit;


import org.junit.Assert;
import org.junit.Test;

public class Asserts_inJunit 
{

	@Test
	public void test1() 
	{
		Assert.assertEquals("mq", "mq");
		System.out.println("Matchfound");
	}
	
	@Test
	public void test2() 
	{
		Assert.assertEquals("m1", "mq");
		System.out.println("match found");
	}
	

	@Test
	public void test3() 
	{
		Assert.assertTrue("Login error", false);
		System.out.println("Login Displayed");
	}
	
	@Test
	public void test4() 
	{
		Assert.assertTrue("Login error", true);
		System.out.println("Login Displayed");
	
	}

}
