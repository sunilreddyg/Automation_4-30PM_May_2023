package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class RunningTags 
{
	@RunWith(Cucumber.class)
	@CucumberOptions(features="resource/features/background.feature",
	glue="",
	dryRun=false)
	public class TestRunner 
	{

	}

}
