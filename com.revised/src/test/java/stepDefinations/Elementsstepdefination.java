package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectpage.Elementsobject;
import objectpage.Objectmanager;
import utilsclass.Setuptest;

public class Elementsstepdefination {

	WebDriver driver;
	Setuptest testSetup;
	Objectmanager pageObjectManager;

	public Elementsstepdefination(Setuptest testSetup) {
		this.testSetup = testSetup;

	}

	@Given("^Navigate to the elements page$")
	public void navigate_to_the_elements_page() throws Throwable {
		Elementsobject element = testSetup.pageObjectManager.elementdisplay();
		element.clickarrowbutton();
		Thread.sleep(4000);
		element.clickformbutton();
		Thread.sleep(4000);

	}

	@When("^Enter the fullname \"([^\"]*)\" and email \"([^\"]*)\" and cureent address \"([^\"]*)\" and permannent address \"([^\"]*)\"$")
	public void enter_the_fullname_something_and_email_something_and_cureent_address_something_and_permannent_address_something(
			String strArg1, String strArg2, String strArg3, String strArg4) throws Throwable {
		Elementsobject element = testSetup.pageObjectManager.elementdisplay();
		element.enterFullName(strArg1);
		element.entermail(strArg2);
		element.entercaddress(strArg3);
		element.enterpaddress(strArg4);

	}

	@Then("^Submit the successfully filled1$")
	public void verify_the_successfully_filled1() throws Throwable {

		Elementsobject element = testSetup.pageObjectManager.elementdisplay();
		Thread.sleep(8000);
		element.submitbutton();

	}

}
