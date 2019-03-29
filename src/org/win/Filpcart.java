package org.win;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\eclipse-sivamani\\HotelApp\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get( " https://www.snapdeal.com/");
		//driver.findElement(By.className("_2zrpKA")).sendKeys("8525942459");
		//driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		WebElement mover = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(mover).perform();
		driver.findElement(By.xpath("//span[text()='Redmi Note 5 Pro']")).click();
	
	
	
	}

}
