package stepdefination;

import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable_Example {

	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
	   System.out.println("User available at homepage");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() 
	{
	    System.out.println("User at login page");
	}
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) 
	{
		String R1C0=dataTable.cell(0, 0);
		String R1C1=dataTable.cell(0, 1);
		System.out.println(R1C0+"  "+R1C1);
		
		
			for ( List<String> Rowlist : dataTable.asLists()) 
			{
					String UID=Rowlist.get(0);
					String PWD=Rowlist.get(1);
					System.out.println(UID+"  "+PWD);
			}
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
	   System.out.println("Message displayed");
	}

}
