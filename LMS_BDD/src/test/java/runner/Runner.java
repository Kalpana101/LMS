package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\sath1\\eclipse-workspace\\LMS_BDD\\src\\test\\resources\\Features\\ManageUserPage.feature", 		                    
glue={"stepDefinition","ApplicationHooks"} ,
dryRun=false,
monochrome=true,
plugin= {"pretty"} )

		

public class Runner {
	
	}
	
	

