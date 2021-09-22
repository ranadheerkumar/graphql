package com.trailblazer.cucumber;



import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports.html"}
      //  ,glue= {"MyStepdefs"}
      // ,glue = "com.trailblazer.cucumber"
       , features = "src/main/resources/poc.feature"



)
public class TestRunner {
}
