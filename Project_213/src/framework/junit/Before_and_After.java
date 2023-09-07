package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Before_and_After 
{

	@Before //Invoke every test before
	public void setUp() throws Exception 
	{
		System.out.println("Test Precondition");
	}

	@After  //Invoke every test after
	public void tearDown() throws Exception 
	{
		System.out.println("Test Postcondition");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Ignore
	public void test2() 
	{
		System.out.println("test2 executed");
	}
	
	@Test
	public void test3() 
	{
		System.out.println("test3 executed");
	}
	
	@Test
	public void test4() 
	{
		System.out.println("test4 executed");
	}


}
