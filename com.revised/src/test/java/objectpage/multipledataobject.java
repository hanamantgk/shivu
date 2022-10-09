package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class multipledataobject {

	public WebDriver driver;

	public multipledataobject(WebDriver driver) {
		this.driver = driver;
	}

	By user = By.id("userName");
	By pwd = By.id("password");
	By log = By.xpath("//button[text()='Login']");
	By errormessage = By.xpath("//p[text()='Invalid username or password!']");

	public boolean errormessagedisplay() {
		/*
		 * driver.findElement(By.xpath("//p[text()='Invalid username or password!']"))
		 * .isDisplayed();
		 * 
		 */
		return driver.findElement(errormessage).isDisplayed();
	}

}
