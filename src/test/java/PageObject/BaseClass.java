package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;
	public Homepage hp;
	public Productpage pp;
	public Checkoutpage cp;

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();

		hp = new Homepage(driver);
		pp = new Productpage(driver);
		cp = new Checkoutpage(driver);

	}

	public void openURL() {
		driver.get("https://magento.softwaretestingboard.com/");

	}

	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
