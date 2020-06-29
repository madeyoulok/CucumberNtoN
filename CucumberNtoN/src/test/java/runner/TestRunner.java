package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
         (
        	features=".//Features/UpsRefrence.feature",	
        	glue = "stepDefinition",
        	strict = true,
        	monochrome = true,
        	plugin= {"pretty", "html:target/cucumber"}
        	
        	
        	     
        		 
         )

public class TestRunner   {

}


