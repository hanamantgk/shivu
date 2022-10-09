package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectpage.Formobjects;
import objectpage.Objectmanager;
import utilsclass.Setuptest;

public class Formclassdefination {
	WebDriver driver;
	Setuptest testSetup;
	Objectmanager pageObjectManager;

	public Formclassdefination(Setuptest testSetup) {
		this.testSetup = testSetup;

	}

	@Then("Verify the login is success1")
	public void verify_the_login_is_success() throws InterruptedException {
		Formobjects homePage = testSetup.pageObjectManager.getPracticeForm();
		boolean logout12 = homePage.logoutdisplayed();
// Boolean logout=testSetup.driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
		Assert.assertTrue(logout12, "User is not logged to the application");
		System.out.println("Logout is" + logout12);

	}

	@Given("Navigate to the practice form")
	public void navigate_to_the_practice_form() throws InterruptedException {
//	testSetup.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]"))
//			.click(); 
//	testSetup.driver.findElement(By.xpath("//*[@id=\"item-0\"]/span[text()='Practice Form']")).click();
//
		Formobjects homePage = testSetup.pageObjectManager.getPracticeForm();
		Thread.sleep(4000);
		homePage.clickform();
		;
		Thread.sleep(4000);
		homePage.clickpracticeForm();

	}

	@When("Enter the firstname {string} and lastname {string}")
	public void enter_the_firstname_and_lastname(String firstname, String lastname) throws InterruptedException {
//	PracticeForm practiceForm=new PracticeForm(testSetup.driver);
//	 pageObjectManager=new PageObjectManager(testSetup.driver);
		Formobjects practiceForm = testSetup.pageObjectManager.getPracticeForm();
		Thread.sleep(2000);
		practiceForm.enterFirstName(firstname);
		Thread.sleep(4000);
		practiceForm.enterLastName(lastname);

		// testSetup.driver.findElement(By.id("firstName")).sendKeys(firstname);
//	testSetup.driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@And("Enter the emailid {string}")
	public void enter_the_emailid(String emailid) throws InterruptedException {

//	testSetup.driver.findElement(By.id("userEmail")).sendKeys(emailid);
//	PracticeForm practiceForm=new PracticeForm(testSetup.driver);
		Formobjects practiceForm = testSetup.pageObjectManager.getPracticeForm();
		practiceForm.enterEmailId(emailid);
	}

	@Then("Verify the successfully filled")
	public void verify_the_successfully_filled() throws InterruptedException {
//	String firstname = testSetup.driver.findElement(By.xpath("//*[@id=\"firstName\"]")).getText();
		System.out.println("First name is");
//	testSetup.driver.quit();
	}

	@Then("^Verify the successfully filled1$")
	public void verify_the_successfully_filled1() throws Throwable {

	}

}
