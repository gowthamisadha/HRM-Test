package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"D:/Workspace/HRM/src/test/resources/Features/login.feature"},
		glue= {"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		
		)






public class Runner {

	public static void main(String[] args) {
	

	}

}
