
package utilsclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genericutils {

	public static WebDriver driver;

	public Genericutils(WebDriver driver) {
		this.driver = driver;
	}

	public Genericutils() {
		// TODO Auto-generated constructor stub
	}

	public void switchToWindow() {
		System.out.println("Test");
	}

	public void alertmessage(WebElement a) {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void timeralert(WebElement b) {
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}

	public void twopopupalert(WebElement c) {
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

	}

	public void sendkeysalert(WebElement d) {
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Green is love");
		alert3.accept();
	}

}
