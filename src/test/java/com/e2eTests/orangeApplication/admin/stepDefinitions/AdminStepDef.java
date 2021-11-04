package com.e2eTests.orangeApplication.admin.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.orangeApplication.admin.pageObjects.AdminPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDef {
	
	public WebDriver driver;
	private AdminPage adminPage = new AdminPage();
	
	public AdminStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AdminPage.class);
	}
	
	
	@When("^Je clique sur le menu Admin$")
	public void jeCliqueSurLeMenuAdmin() throws Throwable {
		adminPage.clickAdminMenu();
	}

	@When("^Je clique sur le menu User Management$")
	public void jeCliqueSurLeMenuUserManagement() throws Throwable {
		adminPage.clickUserManagementMenu();
	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void je_saisie_Username(String username) throws Throwable {
		adminPage.fillUsername(username);
	}
	
	@When("^Je clique sur le bouton search$")
	public void jeCliqueSurLeBoutonSearch() throws Throwable {
		adminPage.clickSearchButton();
	}

	@Then("^Je trouve un seul employé \"([^\"]*)\"$")
	public void jeTrouveUnSeulEmployé(String message1) throws Throwable {
		String resultMessage = AdminPage.result.getText();
		Assert.assertTrue(resultMessage.contains(message1));
		System.out.println("L'employé est trouvé");
	}

	@Then("^Je me déconnecte du compte$")
	public void jeDéconnecteDuCompte() throws Throwable {
	    
	}


	
}
