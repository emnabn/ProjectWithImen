package com.e2eTests.orangeApplication.logout.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.orangeApplication.logout.pageObjects.LogoutPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDef {
	public WebDriver driver;

	private LogoutPage logoutpage = new LogoutPage();

	public LogoutStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, LogoutPage.class);
	}

	@When("^je clique sur le boutton welcome$")
	public void je_clique_sur_le_boutton_welcome() throws Throwable {
		System.out.println(driver.getTitle());
		logoutpage.clickWelcomeBoutton();
		//AbstractPage.sleep(5000);
	}

	@When("^je clique sur le boutton logout$")
	public void je_clique_sur_le_boutton_logout() throws Throwable {
		logoutpage.clickLogoutBoutton(driver);
		//AbstractPage.sleep(5000);

	}

	@Then("^je me trouve dans la page de connexion \"([^\"]*)\"$")
	public void je_me_trouve_dans_la_page_de_connexion(String message) throws Throwable {
		String message1 = logoutpage.getText();
		System.out.println(message1);
		Assert.assertEquals(message, message1);
	}
}
