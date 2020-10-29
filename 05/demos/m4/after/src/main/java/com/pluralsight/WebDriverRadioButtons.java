package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:////Users/josejunior/dev/git/automated-web-testing-selenium-webdriver-java/05/demos/m4/after/src/main/webapp/RadioButtonTest.html");

		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(1).click();
		
		for (WebElement radioButton : radioButtons) {
			if(radioButton.isSelected()) {
				System.out.println(radioButton.getAttribute("value"));
			}
		}

	}

}
