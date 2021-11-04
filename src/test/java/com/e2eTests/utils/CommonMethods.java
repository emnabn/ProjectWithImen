package com.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.AbstractPage;


public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;
	public CommonMethods() {
		driver = Setup.driver;
	}
	public void scrollerBottom() {
		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void openURLWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}

	//Select from drop down list
	public void selectMethos (WebElement element, String methods, String indicator) {
		Select selection = new Select(element);
		if (methods == "Index") {
			selection.selectByIndex(Integer.parseInt(indicator));
		} else if (methods == "Value") {
			selection.selectByValue(indicator);
		} else if (methods == "VisibleText") {
			selection.selectByVisibleText(indicator);
		}

	}

	/**
	 * An expectation for checking WebElement with given locator has text with a value as a part of
	 * it
	 *
	 * @param locator used to find the element
	 * @param pattern used as expected text matcher pattern
	 * @return Boolean true when element has text value containing @value
	 */
	public static ExpectedCondition<Boolean> textMatches(final By locator, final Pattern pattern) {
		return new ExpectedCondition<Boolean>() {
			private String currentValue = null;

			@Override
			public Boolean apply(WebDriver driver) {
				try {
					currentValue = driver.findElement(locator).getText();
					return pattern.matcher(currentValue).find();
				} catch (Exception e) {
					return false;
				}
			}

			@Override
			public String toString() {
				return String
						.format("text found by %s to match pattern \"%s\". Current text: \"%s\"",
								locator, pattern.pattern(), currentValue);
			}
		};
	}


}
