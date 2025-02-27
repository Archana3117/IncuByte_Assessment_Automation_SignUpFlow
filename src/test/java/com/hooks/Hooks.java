package com.hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.browserfactory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private DriverFactory driverFactory;
	private ConfigReader configReader;
	        Properties prop;

	   
	        
	@Before(order = 1) 
	public void getproperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 2)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();

		driverFactory.init_driver(browserName);

	}

	@After(order = 0)
	public void quitBrowser() {
		//DriverFactory.getDriver().quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		String screenshotName = null;

		if (scenario.isFailed())

			screenshotName = scenario.getName().replace(" ", ",");

		byte[] sourcePath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
	}

}
