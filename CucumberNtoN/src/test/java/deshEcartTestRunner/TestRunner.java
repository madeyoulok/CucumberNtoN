package deshEcartTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
         (
        	features=".//Features/Customers.feature",	
        	glue = "stepDefinition",
        	dryRun = false,
        	monochrome = true,
        	plugin = {"pretty","html:Test-Output"}      
        		 
         )

public class TestRunner {

}


