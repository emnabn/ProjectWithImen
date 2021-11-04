package com.e2eTests.superCalculator.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.superCalculator.pageObjects.SuperCalculatorPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModuloStepDef {
	
	public WebDriver driver;
	private SuperCalculatorPage superCalculatorPage = new SuperCalculatorPage();
	public ModuloStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, SuperCalculatorPage.class);
	}

	@When("^Je selecte la fonction modulo \"([^\"]*)\"$")
	public void jeSelecteLaFonctionModulo(String operate) throws Throwable {
		superCalculatorPage.selectOperator(operate);
	}

	@Then("^Le résultat de modulo s'affiche \"([^\"]*)\"$")
	public void leRésultatDeModuloSAffiche(String resOp) throws Throwable {
		String resultOp = superCalculatorPage.getResult(driver);
		Assert.assertEquals(resultOp, resOp);
	}


	
}
