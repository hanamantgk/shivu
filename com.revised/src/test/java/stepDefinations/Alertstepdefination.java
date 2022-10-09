package stepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectpage.Alertpage;
import objectpage.Elementsobject;
import objectpage.Objectmanager;
import utilsclass.Genericutils;
import utilsclass.Setuptest;

public class Alertstepdefination {
	WebDriver driver;
	Setuptest testSetup;
	Objectmanager pageObjectManager;
	public Genericutils genericUtils;

	public Alertstepdefination(Setuptest testSetup) {
		this.testSetup = testSetup;

	}

	@Given("^Navigate to the alert page$")
	public void navigate_to_the_alert_page() throws Throwable {
		Thread.sleep(5000);
		Alertpage alert1 = testSetup.pageObjectManager.alertdisplay();
		Thread.sleep(5000);
		alert1.alertclick();
		Thread.sleep(5000);
		alert1.clickonalertbutton();
		Thread.sleep(5000);
	}

	@When("^click on alert button$")
	public void click_on_alert_button() throws Throwable {
		Alertpage alert1 = testSetup.pageObjectManager.alertdisplay();
		/*
		 * alert1.clickonclickmebutton(); Thread.sleep(4000); Genericutils utils1 = new
		 * Genericutils(); //utils1.alertmessage(); Thread.sleep(10000); Alertpage
		 * alert2 = testSetup.pageObjectManager.alertdisplay();
		 * alert2.secondndalertbutton(); Thread.sleep(10000); Genericutils utils2 = new
		 * Genericutils(); //utils2.timeralert(); Thread.sleep(10000); Alertpage alert3
		 * = testSetup.pageObjectManager.alertdisplay(); alert3.thirdalertbutton();
		 * Thread.sleep(10000); Genericutils utils3 = new Genericutils();
		 * //utils3.twopopupalert(); Thread.sleep(10000); Alertpage alert4 =
		 * testSetup.pageObjectManager.alertdisplay(); alert4.fourthalertbutton();
		 * Thread.sleep(10000); Genericutils utils4 = new Genericutils();
		 * //utils4.sendkeysalert();
		 */	
		alert1.clickonclickmebutton();
	alert1.secondndalertbutton();
	alert1.thirdalertbutton();
	alert1.fourthalertbutton();
	}

	@Then("^Verify the alert button$")
	public void verify_the_alert_button() throws Throwable {
		

		System.out.println("completed alert");
	}

}
