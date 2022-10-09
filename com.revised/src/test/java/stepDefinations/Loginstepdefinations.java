package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectpage.Loginobject;
import objectpage.Objectmanager;
import utilsclass.Setuptest;

public class Loginstepdefinations {
	Setuptest testsetup;
	Objectmanager pageObjectManager;
	public WebDriver driver;

	public Loginstepdefinations(Setuptest testSetup) {
		this.testsetup = testSetup;
	}

	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Git hub training files\\chromedriver_win32 (2)\\chromedriver.exe");
		 * 
		 * driver = new ChromeDriver(); driver.get("https://demoqa.com/login");
		 * driver.manage().window().maximize(); Thread.sleep(5000);
		 */
		System.out.println("launch ");

	}

	@When("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {

		// Loginobject loginpage=new Loginobject(testsetup.driver);
		Loginobject loginpage1 = testsetup.pageObjectManager.getLoginPage();
		loginpage1.enterusername(strArg1);
		loginpage1.enterpassword(strArg2);
		loginpage1.enterlogin();

		/*
		 * driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(strArg1);
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(strArg2);
		 * driver.findElement(By.xpath("//button[text()='Login']")).click();
		 */

	}

	@Then("^Verify the login is successful$")
	public void verify_the_login_is_successful() throws Throwable {

		/*
		 * String
		 * logout1=driver.findElement(By.xpath("//button[text()='Log out']")).getText();
		 * String logout2= "Log out"; Assert.assertEquals(logout1, logout2); //
		 * Assert.assertTrue(logout, "User is not logged to the application"); }
		 */

		/*
		 * LoginPage loginpage=testSetup.pageObjectManager.getLoginPage(); Boolean
		 * logout1=loginpage.logoutButton(); Assert.assertTrue(logout1,
		 * "User is not logged to the application");
		 */
		Loginobject loginpage1 = testsetup.pageObjectManager.getLoginPage();
		boolean logout1 = loginpage1.logoutdisplayed();
		Assert.assertTrue(logout1, "User is not logged to the application");

		System.out.println("launch correctly ");

	}
}
