package org.win;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ShopCulas {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\eclipse-sivamani\\HotelApp\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		WebElement mover = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(mover).perform();
		Thread.sleep(3000);
		WebElement wp = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		wp.click();
		//det_img_136042870
		Thread.sleep(3000);
				
		//windows handling
		 String pwind = driver.getWindowHandle();
		 System.out.println(pwind);
		   // get all windows
		 Set<String> allwind = driver.getWindowHandles();
		 System.out.println(allwind);
		   //iterate
	    for (String cwind : allwind) {
			   if (!(pwind.equals(cwind))) {
				   driver.switchTo().window(cwind);
		 driver.findElement(By.xpath("//span[text()='Infocus Vision 3 (2 GB, 16 GB, Midnight Black)']")).click();
					   }
		}
	    
	   
	}
}
	