package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass //Invoke before execution of first test
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass //Invoke after execution of last test
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
	}

	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("test2 executed");
	}
	
	@Test
	public void test3() 
	{
		System.out.println("test3 executed");
	}

}
