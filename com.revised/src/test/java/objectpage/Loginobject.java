package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilsclass.Scriptexecutor;

//import utilsclass.Javascriptexecutor;



public class Loginobject {

	public WebDriver driver;
	public Scriptexecutor javaScriptExecutor;

	public Loginobject(WebDriver driver) {
		this.driver = driver;
	javaScriptExecutor=new Scriptexecutor(driver);
	}

	By user = By.id("userName");
	By pwd = By.id("password");
	By log = By.xpath("//button[text()='Login']");
	By logt = By.xpath("//button[text()='Log out']");

	public void enterusername(String s1) {
		driver.findElement(user).sendKeys(s1);
	}

	public void enterpassword(String s2) {
		driver.findElement(pwd).sendKeys(s2);
	}

	public void enterlogin() throws InterruptedException {
	WebElement login1=driver.findElement(log);
		javaScriptExecutor.executeScriptByXpath(login1);
		//driver.findElement(log).click();
	}

	public boolean logoutdisplayed() {
		return driver.findElement(logt).isDisplayed();
	}
}
