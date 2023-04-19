package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/features/Login.feature"}, //provide the feature file which should be executed
		glue = {"stepDefination"}, //will bind feature file with step defination
		dryRun = false,  //all the step defination will be generated with browser launch
						//false - browser will be launched
		monochrome = true //console output is in readable format
		
		)



public class RunnerIO extends AbstractTestNGCucumberTests{

}
