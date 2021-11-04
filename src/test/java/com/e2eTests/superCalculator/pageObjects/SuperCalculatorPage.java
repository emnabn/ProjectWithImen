package com.e2eTests.superCalculator.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.utils.CommonMethods;
import com.e2eTests.utils.WaitsMethods;

public class SuperCalculatorPage {
	
	private CommonMethods commonMethods = new CommonMethods();
	private WaitsMethods waitsMethods = new WaitsMethods();
	/*Locators*/
	final static String FIRST_VALUE = "//*[@ng-model ='first']";
	final static String SECOND_VALUE = "//*[@ng-model = 'second']";
	final static String OPERATOR = "//*/select[@ng-model = 'operator']";
	final static String GO_BUTTON = "gobutton";
	final static String RESULT = "h2";
	
	/*@FindBy*/
	@FindBy(how=How.XPATH, using=FIRST_VALUE)
	public static WebElement firstValue;
	@FindBy(how=How.XPATH, using=SECOND_VALUE)
	public static WebElement secondValue;
	@FindBy(how=How.XPATH, using=OPERATOR)
	public static WebElement operator;
	@FindBy(how=How.ID, using=GO_BUTTON)
	public static WebElement btnGo;
	//@FindBy(how=How.TAG_NAME, using=RESULT)
	public By resultLoc = By.tagName(RESULT);
	public static WebElement result;
	
	/*Methods*/
	
	public void fillFirstNumer(String firstNumber) {
		firstValue.sendKeys(firstNumber);
	}
	
	public void fillSecondNumer(String secondNumber) {
		secondValue.sendKeys(secondNumber);
	}
	
	public void selectOperator (String operation) {
		String method = "Value";
		commonMethods.selectMethos(operator, method, operation);
	}
	
	public void clickGoButton() {
		btnGo.click();
	}
	
	public String getResult (WebDriver driver1) {
		result=waitsMethods.patternExplicitWait(driver1, resultLoc, 20);
		String resultOperation = result.getText();
		System.out.println(resultOperation);
		return resultOperation;
		
	}
}
