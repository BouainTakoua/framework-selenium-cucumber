package com.e2eTest.automation.util;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	public static WebDriver driver;
	static DriverManager drivermanager;

	@Before
	/**
	 * call browser with the design pattern factory navigator
	 **/
	public static void setup() {

		drivermanager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = drivermanager.getDriver();

	}
	

	@After 
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 **/
	public void embedScreenshot(Scenario scenario) {
		if (scenario.isFailed()){
			try {
				scenario.write("current page URL is" +driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}catch(WebDriverException somePlatformDontsupportScreenshots) {
				System.err.println(somePlatformDontsupportScreenshots.getMessage());
				
			}
		}
		driver.quit();
	}
}
