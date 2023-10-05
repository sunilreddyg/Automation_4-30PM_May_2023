package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline_Example 
{
	@Given("User is on Home Page fb")
	public void user_is_on_home_page_fb() 
	{
	    System.out.println("User on homepage");
	}
	@When("User Navigate to LogIn Page1")
	public void user_navigate_to_log_in_page1() 
	{
	    System.out.println("Loginpage");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	    System.out.println(string+"    "+string2);
	}
	@Then("Message displayed Login Successfully after login")
	public void message_displayed_login_successfully_after_login() 
	{
	   System.out.println("Login Verified");
	}
}
