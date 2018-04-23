package StepDefinitionFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.java.it.Date;
import cucumber.api.junit.Cucumber;

// runner class

@RunWith(Cucumber.class)
@CucumberOptions(features="dailyroutine.feature",glue={"StepDefinition"}, 
format={"html:output","json:cucumber.json"})public class TestRunner {
	
	
	
	
	
}
