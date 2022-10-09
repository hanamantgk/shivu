package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilsclass.Genericutils;
import utilsclass.Scriptexecutor;

public class Alertpage {
public Genericutils gu;
	public WebDriver driver;

	public Alertpage(WebDriver driver) {
		this.driver = driver;
		gu=new Genericutils(driver);
	}

	By alertclick = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[2]/div[2]");
	By clickonalertbutton = By.xpath("//*//span[text()='Alerts']");
	By clickonclickmebutton = By.xpath("//*[@id=\"alertButton\"]");

	By secondndalertbutton = By.xpath("//*[@id=\"timerAlertButton\"]");
	By thirdalertbutton = By.xpath("//*[@id=\"confirmButton\"]");
	By fourthalertbutton = By.xpath("//*[@id=\"promtButton\"]");

	public void alertclick() {
		driver.findElement(alertclick).click();

	}

	public void clickonalertbutton() {
		driver.findElement(clickonalertbutton).click();
	}

	public void clickonclickmebutton() {
		WebElement a=driver.findElement(clickonclickmebutton);
		a.click();
		gu.alertmessage(a);
	}

	public void secondndalertbutton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement b=driver.findElement(secondndalertbutton);
		b.click();
		Thread.sleep(5000);
		gu.timeralert(b);
	}

	public void thirdalertbutton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement c=driver.findElement(thirdalertbutton);
		c.click();
		Thread.sleep(5000);
		gu.twopopupalert(c);
	}

	public void fourthalertbutton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement d=driver.findElement(fourthalertbutton);
		d.click();
		Thread.sleep(5000);
		gu.sendkeysalert(d);
	}

}
