package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
             (
            	features=".//Features/paymentDetails.feature",
            	glue="stepDefinitions",
            	dryRun= false,
            	monochrome=true,
            	plugin= {"pretty", "html:target/cucumber-html-report.html"}
            		   
             )

public class TestRun {

}
