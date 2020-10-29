package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/josejunior/dev/git/automated-web-testing-selenium-webdriver-java/05/demos/m4/after/src/main/webapp/CheckboxTest.html");
		
		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		
		checkbox.click();
		checkbox.click();

	}

}
