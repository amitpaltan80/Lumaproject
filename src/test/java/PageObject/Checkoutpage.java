package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage extends BaseClass {

	Checkoutpage(WebDriver driver) {
		this.driver = driver;
	}

	public void CheckOutpage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='counter qty'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("customer-email")).sendKeys("abc123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("PQ75WOX")).sendKeys("amit");
		Thread.sleep(3000);
		driver.findElement(By.id("AE036CH")).sendKeys("paltan");
		Thread.sleep(3000);
		driver.findElement(By.id("FEJN4CL")).sendKeys("xxxx");
	}

}
