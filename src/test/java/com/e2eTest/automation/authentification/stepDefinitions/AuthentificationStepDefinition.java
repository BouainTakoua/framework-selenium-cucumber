package com.e2eTest.automation.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.CommonMethods;
import com.e2eTest.automation.util.Setup;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods{

	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage(driver);
	private CommonMethods commonMethods = new CommonMethods();
	
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^je ouvre l application OrangeHRM$")
	public void jeOuvreLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFromConfigFile();
		logger.info("je ouvre l application OrangeHRM");
	}

	@When("^je saisie username$")
	public void jeSaisieUsername() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.sendUserName();
		logger.info("je saisie username");
	}

	@When("^je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		authentificationPage.sendUserPassWord();
		logger.info("je saisie le mot de passe");
	}

	@When("^clique sur le boutton login$")
	public void cliqueSurLeBouttonLogin() throws Throwable {
		authentificationPage.clickLoginButton();
		logger.info("clique sur le boutton login");
	}

	@Then("^redirection vers la page home$")
	public void redirectionVersLaPageHome() throws Throwable {
		String welcome = AuthentificationPage.welcome.getText();
		Assert.assertTrue(welcome.contains("Welcome"));
		logger.info("redirection vers la page home");
	}
}