package utilsclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import objectpage.Objectmanager;

public class Setuptest {

	// Some times it is working with static webdriver
	public WebDriver driver;
	public Basetest testBase;
	public Objectmanager pageObjectManager;
	public Genericutils genericUtils;

	public Setuptest() throws IOException {
		testBase = new Basetest();
		pageObjectManager = new Objectmanager(testBase.webDriverManager());
		genericUtils = new Genericutils(testBase.webDriverManager());
	}

}
