package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/josejunior/dev/git/automated-web-testing-selenium-webdriver-java/05/demos/m4/after/src/main/webapp/SelectItemTest.html");
		
		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");

	}

}
