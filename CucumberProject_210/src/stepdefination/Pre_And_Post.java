package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Pre_And_Post 
{

		//@Before(order=2)
		public void setupbrowser()
		{
			System.out.println("Browser initiated");
		}
		
		//@Before(order=1)
		public void getcon()
		{
			System.out.println("check internet connection");
		}
		
		
		//@After
		public void teardown(Scenario sc)
		{
			if(sc.isFailed())
			{
				System.out.println("Capture Screen");
			}
			System.out.println("Browser terminated");
		}
}
