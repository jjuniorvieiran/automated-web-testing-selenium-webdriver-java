package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("book about hell");
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Sell")).get(0);
		imagesLink.click();

		WebElement imagesLink2 = driver.findElements(By.linkText("Registry")).get(0);
		imagesLink2.click();
//
//		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
//		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
//		imageLink.click();
	}
}
