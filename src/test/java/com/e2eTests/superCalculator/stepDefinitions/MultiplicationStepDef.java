package com.e2eTests.superCalculator.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.superCalculator.pageObjects.SuperCalculatorPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplicationStepDef {
	
	public WebDriver driver;
	private SuperCalculatorPage superCalculatorPage = new SuperCalculatorPage();
	public MultiplicationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, SuperCalculatorPage.class);
	}
	
	@When("^Je selecte la fonction multiplication \"([^\"]*)\"$")
	public void jeSelecteLaFonctionMultiplication(String operate) throws Throwable {
		superCalculatorPage.selectOperator(operate);
	}

	@Then("^Le résultat de multiplication s'affiche \"([^\"]*)\"$")
	public void leRésultatDeMultiplicationSAffiche(String resOp) throws Throwable {
		String resultOp = superCalculatorPage.getResult(driver);
		Assert.assertEquals(resultOp, resOp);
	}
}
