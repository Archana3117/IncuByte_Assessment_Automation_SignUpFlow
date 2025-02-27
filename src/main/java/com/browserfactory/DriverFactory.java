package com.browserfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public WebDriverWait wait;

	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

	public void WaitUtils(WebDriver driver, int timeoutInSeconds) {

		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	}

	public WebDriver init_driver(String browser)

	{
		System.out.println("Browser value is : " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			tldriver.set(new EdgeDriver());
		} else {
			System.out.println("pass the correct browser type" + browser);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		return getDriver();

	}

	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}
