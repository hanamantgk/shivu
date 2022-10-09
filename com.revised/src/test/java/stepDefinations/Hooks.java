
package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilsclass.Setuptest;

public class Hooks {
	public Setuptest testSetup;

	public Hooks(Setuptest testSetup) {
		this.testSetup = testSetup;
	}

	@After
	public void AfterScenario() throws IOException {
		testSetup.testBase.webDriverManager().quit();

	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {

			WebDriver driver = testSetup.testBase.webDriverManager();
			// Screenshot
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourcePath, new File("./Screenshots/fail31.png"));

			// byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			// scenario.attach(fileContent, "image/png", "image");

			System.out.println("Screenshot taken");
		}

	}

}
