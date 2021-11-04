package com.e2eTests.orangeApplication.buzz.stepDefinitions;

import org.junit.Assert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import com.e2eTests.orangeApplication.buzz.pageObjects.BuzzPage;
import com.e2eTests.utils.Setup;
import com.e2eTests.utils.AbstractPage;
import com.e2eTests.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuzzVideoStepDef {
	public WebDriver driver;
	private BuzzPage buzzPage = new BuzzPage();
	private CommonMethods commonMethods = new CommonMethods();

	public BuzzVideoStepDef() {
		driver = Setup.driver;
	}

	@When("^Je clique sur l'onglet share video$")
	public void jeCliqueSurLOngletShareVideo() throws Throwable {
		buzzPage.clickShareVideoTab();
	}

	@When("^Je saisie l'url dans createVideo_content  \"([^\"]*)\"$")
	public void jeSaisieLUrlDansCreateVideo_content(String vidUrl) throws Throwable {
		buzzPage.fillVideoContentCase(driver, vidUrl);
	}

	@When("^Je clique sur le bouton save video$")
	public void jeCliqueSurLeBoutonSaveVideo() throws Throwable {
		buzzPage.clickSaveVideoButton(driver);
	}

	@Then("^Je vérifie que le video a été partagé \"([^\"]*)\"$")
	public void jeVérifieQueLeVideoAÉtéPartagé(String message) throws Throwable {
		AbstractPage.sleep(1000);
		boolean videoPublished1 = commonMethods.isElementDisplayed(BuzzPage.videoPublished);
		System.out.println(videoPublished1);
		Assert.assertTrue(videoPublished1);		
		System.out.println("The video is published!");		
	}
}
