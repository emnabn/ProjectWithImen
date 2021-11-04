package com.e2eTests.orangeApplication.admin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {
	
	/*Locators*/
	final static String ADMIN_MENU = "//b[contains(text(),'Admin')]";
	final static String USERNAME_ID = "searchSystemUser_userName";
	final static String USER_Management_ID = "menu_admin_UserManagement";
	final static String SEARCH_ID = "searchBtn"; 
	final static String RESULT_EM = "//a[contains(text(),'Alice.Duval')]";
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = ADMIN_MENU )
	public static WebElement adminMenu;
	@FindBy(how = How.ID, using = USERNAME_ID )
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_Management_ID)
	public static WebElement userManagement;
	@FindBy(how = How.ID, using = SEARCH_ID)
	public static WebElement btnSearch;
	@FindBy(how = How.XPATH, using = RESULT_EM )
	public static WebElement result;
	//
	/*Methods*/
	
	public void clickAdminMenu() {
		adminMenu.click();
	}

	public void clickUserManagementMenu() {
		userManagement.click();
		
	}
	public void fillUsername(String username) {
		userName.sendKeys(username);
		
	}
	public void clickSearchButton() {
		btnSearch.click();		
	}
}
