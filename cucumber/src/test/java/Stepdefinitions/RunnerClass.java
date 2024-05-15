package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureswithTags",
glue= {"Stepdefinitions"},
monochrome=true,
tags = "@tag1,@tag2",
plugin= {"pretty","html:target/HtmlReport", 
		"junit:target/JSONReports/report.json"})


public class RunnerClass {

}
