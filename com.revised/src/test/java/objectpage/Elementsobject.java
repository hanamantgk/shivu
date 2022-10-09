package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elementsobject {

	public WebDriver driver;

	public Elementsobject(WebDriver driver) {
		this.driver = driver;
	}

	By fullname = By.xpath("//*[@id=\"userName\"]");
	By email = By.xpath("//*[@id=\"userEmail\"]");
	By crntadd = By.xpath("//*[@id=\"currentAddress\"]");
	By permntadd = By.xpath("//*[@id=\"permanentAddress\"]");
	By submit12 = By.xpath("//*[@id='submit']");
	By clickarrow = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]");
	By clickformbt = By.xpath("//*[@id=\"item-0\"]");

	public void clickarrowbutton() {
		driver.findElement(clickarrow).click();
		;

	}

	public void clickformbutton() {
		driver.findElement(clickformbt).click();
		;
	}

	public void enterFullName(String fname) {
		driver.findElement(fullname).sendKeys(fname);
	}

	public void entermail(String lname) {
		driver.findElement(email).sendKeys(lname);
	}

	public void entercaddress(String add) {
		driver.findElement(crntadd).sendKeys(add);

	}

	public void enterpaddress(String padd) {
		driver.findElement(permntadd).sendKeys(padd);

	}

	public void submitbutton() {
		driver.findElement(submit12).click();

	}

}
