package framework.junit;

import org.junit.Ignore;
import org.junit.Test;

@Ignore("Class not ready for tests")
public class IgnoreTest 
{

	@Test  //Invoke method to run
	public void test1() 
	{
		System.out.println("test1 Executed");
	}
	
	//Method doesn't run because @Test not specified
	public void test2() 
	{
		System.out.println("test2 Executed");
	}
	
	@Ignore  //Ignore method running
	public void test3() 
	{
		System.out.println("test3 Executed");
	}
	
	@Test  //Invoke method to run
	public void test4() 
	{
		System.out.println("test4 Executed");
	}
}
