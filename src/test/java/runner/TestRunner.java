package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="src/test/resources/features"
				, glue = { "stepDefinition" }
				,plugin= { "pretty"
				, "html:src/target/cucumber-defualt-reports"
				,"json:cucumber.json"
				}
				,tags= {"@login"}
				,dryRun=false
				,monochrome=true
						)

public class TestRunner {

}
