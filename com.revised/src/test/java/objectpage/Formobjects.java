package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Formobjects {
	public WebDriver driver;

	public Formobjects(WebDriver driver) {
		this.driver = driver;
	}

	By fstName = By.id("firstName");
	By lstName = By.id("lastName");
	By emailid = By.id("userEmail");
	By clickform = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]");

	By clickpracticeForm = By.xpath("//*[@id=\"item-0\"]/span[text()='Practice Form']");
	By logt = By.xpath("//button[text()='Log out']");

	public boolean logoutdisplayed() {
		boolean logoutButton = driver.findElement(logt).isDisplayed();
		return logoutButton;
	}

	public void clickform() {
		driver.findElement(clickform).click();
		;
	}

	public void clickpracticeForm() {
		driver.findElement(clickpracticeForm).click();

	}

	public void enterFirstName(String firstname) {
		driver.findElement(fstName).sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		driver.findElement(lstName).sendKeys(lastname);
	}

	public void enterEmailId(String emailId) {
		driver.findElement(emailid).sendKeys(emailId);

	}

	/*
	 * public void clickform(){ driver.findElement(fstName).click();; } public void
	 * clickpracticeForm(){ driver.findElement(fstName).click();
	 * 
	 * } public boolean logoutdisplayed(){ boolean
	 * logoutButton=driver.findElement(logt).isDisplayed(); return logoutButton; }
	 */
}
