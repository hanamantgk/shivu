package utilsclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {

	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {

		// Read the data from the properties
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resourcefile\\info1.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("qa");

		if (driver == null) {

			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resourcefile\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			/*
			 * if (prop.getProperty("browser").equalsIgnoreCase("firefox")) { // create the
			 * firefox instance }
			 * 
			 * if (prop.getProperty("browser").equalsIgnoreCase("edge")) { // create the
			 * edge instance }
			 */

			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.manage().window().maximize();
		}
		return driver;
	}

}
