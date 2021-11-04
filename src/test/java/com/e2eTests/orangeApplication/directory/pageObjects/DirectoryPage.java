package com.e2eTests.orangeApplication.directory.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DirectoryPage {
	
	/*Locators */
	final static String DIRECTORY_MENU = "//b[contains(text(),'Directory')]";
	final static String SEARCH_AREA = "searchDirectory_emp_name_empName";
	final static String SEARCH_BUTTON_ID = "searchBtn";
	final static String EMPLOYE_SEARCHED = "//b[contains(text(),'Alice Duval')]";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = DIRECTORY_MENU)
	public static WebElement directoryMenu;
	@FindBy(how = How.ID, using = SEARCH_AREA)
	public static WebElement searchName;
	@FindBy(how = How.ID, using = SEARCH_BUTTON_ID)
	public static WebElement btnSearch;
	@FindBy(how = How.XPATH, using = EMPLOYE_SEARCHED)
	public static WebElement employeSearched;
	
	/*Methods */

	public void clickDirectoryMenu() {
		directoryMenu.click();
	}
	
	public void fillSearchArea(String name) {
		searchName.sendKeys(name);
	}
	
	public void clickSearchButton() {
		btnSearch.click();
	}
	
	

}