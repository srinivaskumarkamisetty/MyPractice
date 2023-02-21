package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "features" },

		glue = "StepDefinations",
		//dryRun=true,
		monochrome = true,
		publish=true
		
		
		
		)
public class Runner {

}
