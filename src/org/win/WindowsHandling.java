package org.win;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\eclipse-sivamani\\HotelApp\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		   WebElement mover = driver.findElement(By.id("nav-link-shopall"));
		   Actions acc = new Actions(driver);
		   acc.moveToElement(mover).perform();
		   WebElement mover1 = driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"));
		   Actions acc1 = new Actions(driver);
		   acc.moveToElement(mover1).perform();
		   WebElement dslr = driver.findElement(By.xpath("//span[text()='DSLR Cameras']"));
		   dslr.click();
		   Thread.sleep(2000);
		   WebElement canaon = driver.findElement(By.xpath("//span[text()='Canon EOS 1300D 18MP Digital SLR...']"));
		   canaon.click();
		   Thread.sleep(3000);
		   // parent window
		   String pwind = driver.getWindowHandle();
		   System.out.println(pwind);
		   // get all windows
		   Set<String> allwind = driver.getWindowHandles();
		   System.out.println(allwind);
		   //iterate
		   for (String cwind : allwind) {
			   if (!(pwind.equals(cwind))) {
				   driver.switchTo().window(cwind);
				   driver.findElement(By.id("add-to-cart-button")).click();
							}
		}
	
	}

}
//