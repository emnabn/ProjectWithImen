package com.e2eTests.orangeApplication.buzz.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.orangeApplication.buzz.pageObjects.BuzzPage;
import com.e2eTests.utils.AbstractPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuzzStatusStepDef {

	public WebDriver driver;
	private BuzzPage buzzPage = new BuzzPage();
	

	public BuzzStatusStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, BuzzPage.class);
	}

	@When("^Je clique sur le menu Buzz$")
	public void je_clique_sur_le_menu_Buzz() throws Throwable {
		buzzPage.clickBuzzMenu();
	}

	@When("^Je clique sur le bouton Update Status$")
	public void je_clique_sur_le_bouton_Update_Status() throws Throwable {
		buzzPage.clickUpdateStateTab();
	}

	@When("^Je saisie un message dans la case Post-Content \"([^\"]*)\"$")
	public void je_saisie_un_message_dans_la_case_Post_Content(String post1) throws Throwable {
		buzzPage.fillThePostHolder(post1);                       
	}

	@When("^Je clique sur le bouton Post-Submit$")
	public void je_clique_sur_le_bouton_Post_Submit() throws Throwable {
		buzzPage.clickPostSubmitButton();
	}
	
	@Then("^Je vérifie que le message a été soumis \"([^\"]*)\"$")
	public void je_vérifie_que_le_message_a_été_soumis(String message) throws Throwable {
		AbstractPage.sleep(5000);
		String postPublished1 = BuzzPage.postPublished.getText();
		Assert.assertTrue(postPublished1.equals(message));
		System.out.println(postPublished1);
	}
}
