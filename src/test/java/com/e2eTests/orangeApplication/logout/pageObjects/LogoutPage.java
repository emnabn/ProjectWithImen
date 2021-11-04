package com.e2eTests.orangeApplication.logout.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.utils.WaitsMethods;

public class LogoutPage {
	
	private WaitsMethods waitsMethods = new WaitsMethods();
	/*Locators */
	final static String WELCOME_ID = "welcome";
	final static String LOGOUT_XPATH = "//*/div[@id='welcome-menu']/ul[1]/li[3]/a";
	final static String LOGIN_PANEL = "logInPanelHeading";
	
	/* @FindBy */
	@FindBy(how = How.ID, using = WELCOME_ID)
	public static WebElement welcomeBtn;
	/*
	 * @FindBy(how = How.XPATH, using = LOGOUT_XPATH) public static WebElement
	 * logoutBtn;
	 */
	public static By logoutLocator = By.xpath(LOGOUT_XPATH);
	@FindBy(how = How.ID, using = LOGIN_PANEL)
	public static WebElement loginPanel;
	
	/*Methods */

	public void clickWelcomeBoutton() {
		welcomeBtn.click();
	}
	public void clickLogoutBoutton(WebDriver driver1) {
		WebElement logoutBtn = waitsMethods.explicitWaitUntilVisibilityOfButton(driver1, logoutLocator, 5);
		System.out.println(logoutBtn.getText());
		logoutBtn.click();
	}
	public String getText() {
		String text = loginPanel.getText();
		return text;
	}
}
