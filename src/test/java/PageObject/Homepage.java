package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BaseClass {

	Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickonshop() throws InterruptedException {
		// to scroll the page
//		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shop New Yoga']")).click();

//		
	}

}
