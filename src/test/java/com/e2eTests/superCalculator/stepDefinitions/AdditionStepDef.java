package com.e2eTests.superCalculator.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.e2eTests.superCalculator.pageObjects.SuperCalculatorPage;
import com.e2eTests.utils.CommonMethods;
import com.e2eTests.utils.Setup;
import com.e2eTests.utils.AbstractPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdditionStepDef {
	
	public WebDriver driver;
	private SuperCalculatorPage superCalculatorPage = new SuperCalculatorPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AdditionStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, SuperCalculatorPage.class);
	}
	
	@Given("^Je me connecte sur l'application superCalculator$")
	public void je_me_connecte_sur_l_application_superCalculator() throws Throwable {
		commonMethods.openURLWithConfigFile("url2");
	}
	
	@Given("^Je saisie le premier numéro \"([^\"]*)\"$")
	public void je_saisie_le_premier_numéro(String firstVal) throws Throwable {
	   superCalculatorPage.fillFirstNumer(firstVal);
	}
	
	@Given("^Je saisie le deuxiéme numéro \"([^\"]*)\"$")
	public void je_saisie_le_deuxiéme_numéro(String secondVal) throws Throwable {
	    superCalculatorPage.fillSecondNumer(secondVal);
	}
	
	@When("^Je selecte la fonction addition \"([^\"]*)\"$")
	public void je_selecte_la_fonction_addition(String operate) throws Throwable {
		superCalculatorPage.selectOperator(operate);		
	}
	
	@When("^Je clique sur le boutton Go$")
	public void je_clique_sur_le_boutton_Go() throws Throwable {
		superCalculatorPage.clickGoButton();
		AbstractPage.sleep(5000);
	}
	
	@Then("^Le résultat d'addition s'affiche \"([^\"]*)\"$")
	public void le_résultat_d_addition_s_affiche(String resOp) throws Throwable {
		String resultOp = superCalculatorPage.getResult(driver);
		Assert.assertEquals(resultOp, resOp);
	}

}
