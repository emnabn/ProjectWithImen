package com.e2eTests.orangeApplication.authentication.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.orangeApplication.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.utils.CommonMethods;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDef extends CommonMethods{
	
	public WebDriver driver;
	private AuthenticationPage authentificationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public AuthenticationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	
	@Given("^Je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		logger.info("Je me connecte sur l'application OrangeHRM");
		commonMethods.openURLWithConfigFile("url1");
	}

	@When("^Je saisie le nom d'utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeNomDUtilisateur(String username) throws Throwable {
		logger.info("Je saisie le nom d'utilisateur");
		authentificationPage.fillUsername(username);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String pswd) throws Throwable {
		logger.info("Je saisie le mot de passe");
		authentificationPage.fillPassword(pswd);
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton login");
		authentificationPage.clickLoginButton();
	}

	@Then("^Je me redirige vers la page Home \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageHome(String message) throws Throwable {
		logger.info("Je me redirige vers la page Home");
		String messageToWelcome = AuthenticationPage.welcome.getText();
		Assert.assertTrue(messageToWelcome.contains(message));
	}

}
