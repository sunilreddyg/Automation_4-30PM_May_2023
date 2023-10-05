package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=
				{
					"resource/features/background.feature",
					"resource/features/multipledata.feature"
				},glue="stepdefination",dryRun=false)
public class SuiteRunner 
{

}