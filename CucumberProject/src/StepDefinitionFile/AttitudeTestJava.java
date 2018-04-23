package StepDefinitionFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AttitudeTestJava {
	
	@When("^He meets ([^\"]*)$")
	public void ln(String str)
	{
		if(str.equals("Watchman"))
		{
			System.out.println("watchman automation");
		}
		if(str.equals("News paper boy"))
		{
			System.out.println("Daytime automation");	
		}
	}

	@Given("^During([^\"]*)$")
	public void lnt(String str)
	{
		if(str.equals("nighttimejob"))
		{
			System.out.println("late night automation");
		}
		if(str.equals("Daytimejob"))
		{
			System.out.println("Daytime automation");	
		}
	}
	@Then("^He ([^\"]*) him $")
	public void lnted(String str)
	{
		if(str.equals("greets"))
		{
			System.out.println("greeted automation");
		}
		if(str.equals("doesn't greets"))
		{
			System.out.println("Doesn't get the greetings");	
		}
	}

}
