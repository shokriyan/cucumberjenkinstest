package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="src/test/resources/features"
				,tags= {}
				, glue = { "stepDefinition" }
				, dryRun = false
				, plugin = {"pretty",
						"html:target/default-report",
						"json:target/cucumber.json"}
				, monochrome = true)

public class TestRunner {

}
