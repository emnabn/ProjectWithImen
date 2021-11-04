package com.e2eTests.orangeApplication.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2eTests.orangeApplication.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class AuthenticationMultiUser {
	public WebDriver driver;
	private AuthenticationPage authentificationPage = new AuthenticationPage();
	
	public AuthenticationMultiUser() {
		driver = Setup.driver;		
	}
	
	@When("^Je saisie username \"([^\"]*)\"$")
	public void jeSaisieUsername(String user) throws Throwable {
		authentificationPage.fillUsername(user);
	}

	@When("^Je saisie password \"([^\"]*)\"$")
	public void jeSaisiePassword(String psd) throws Throwable {
	    authentificationPage.fillPassword(psd);
	}
}
