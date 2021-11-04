package com.e2eTests.utils;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsMethods {
	
	WebDriverWait waitExplicit;
	WebDriverWait waitPatern;
	//private CommonMethods commonMethods = new CommonMethods();

	
		
	public void implicitWait(WebDriver driver_i, long second_i) {	
		driver_i.manage().timeouts().implicitlyWait(second_i, TimeUnit.MILLISECONDS);
	}
	
	public WebElement explicitWaitUntilVisibilityOfButton(WebDriver driver_e, By locator_e, long second_e) {
		WebElement button;
		waitExplicit = new WebDriverWait(driver_e, second_e);
		button = waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(locator_e));
		return button;
	}
	
	public WebElement patternExplicitWait(WebDriver driver_p, By locator_p, long second_p) {
		WebElement element;
		waitPatern = new WebDriverWait(driver_p, second_p);
		Pattern pattern = Pattern.compile("\\d+");
		waitPatern.until(CommonMethods.textMatches(locator_p, pattern));
		element = driver_p.findElement(locator_p);
		return element;
	}
	

}
