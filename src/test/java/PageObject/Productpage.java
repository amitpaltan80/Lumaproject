package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage extends BaseClass {

	Productpage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnProduct() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("option-label-size-143-item-171")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("option-label-color-93-item-49")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

	}

}
