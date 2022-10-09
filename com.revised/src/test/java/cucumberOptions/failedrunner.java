package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations", monochrome = true,

		plugin = { "html:target/cucumer.html", "json:target/cucumber.json", "rerun:target/failed.txt" })
public class failedrunner extends AbstractTestNGCucumberTests {

}
