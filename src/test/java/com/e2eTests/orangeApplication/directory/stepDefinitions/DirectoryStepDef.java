package com.e2eTests.orangeApplication.directory.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.orangeApplication.directory.pageObjects.DirectoryPage;
import com.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DirectoryStepDef {

	public WebDriver driver;

	private DirectoryPage directoryPage = new DirectoryPage();

	public DirectoryStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, DirectoryPage.class);
	}

	@When("^je clique sur le menu Directory$")
	public void jeCliqueSurLeMenuDirectory() throws Throwable {
		directoryPage.clickDirectoryMenu();
	}

	@When("^je saisie Name \"([^\"]*)\"$")
	public void jeSaisieName(String name) throws Throwable {
		directoryPage.fillSearchArea(name);
	}

	@When("^je clique sur search$")
	public void jeCliqueSurSearch() throws Throwable {
		directoryPage.clickSearchButton();

	}

	@Then("^l'employé sera affiché \"([^\"]*)\"$")
	public void lEmployéSeraAffiché(String name) throws Throwable {
		
		String resultMessage = DirectoryPage.employeSearched.getText();
		Assert.assertTrue(resultMessage.contains(name));
		System.out.println("L'employé est trouvé");
	}
}

