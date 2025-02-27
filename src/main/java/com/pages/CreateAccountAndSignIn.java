package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountAndSignIn {
//ToDo: write all xpath related to webpage here(POJO class)
	private WebDriver driver;

	public CreateAccountAndSignIn(WebDriver driver) {
		this.driver = driver;
	}

	private By createAccountOnHomePage = By
			.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By Email = By.id("email_address");
	private By password = By.xpath("//input[@id='password']");
	private By confirmPassword = By.xpath("//input[@name='password_confirmation']");
	private By createAccountbutton = By.xpath("//button[@title='Create an Account']");
	private By accountconfirmsg = By.xpath(
			"//main[@class='page-main']//div[2]//div[contains(text(),'Thank you for registering with Main Website Store.')]");

	private By SignIn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	private By email = By.id("email");
	private By passowrd = By.id("pass");
	private By signInbutton = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");

	// Registration

	public void clickonCreateAccountonHomePage() {
		driver.findElement(createAccountOnHomePage).click();
	}

	public void enterfirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}

	public void enterlastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}

	public void enterEmail(String email) {
		driver.findElement(Email).sendKeys(email);

	}

	public void enterPassword(String passwd) {
		driver.findElement(password).sendKeys(passwd);
	}

	public void enterConfirmPassword(String cnfpasswd) {
		driver.findElement(confirmPassword).sendKeys(cnfpasswd);
	}

	public void clikonButton() {
		driver.findElement(createAccountbutton).click();
	}

	public String confirmMsg() {
		return driver.findElement(accountconfirmsg).getText();
	}

	// signIn
	public void clickonsignIn() {
		driver.findElement(SignIn).click();
	}

	public void enterEmailforSignIn(String emal) {
		driver.findElement(email).sendKeys(emal);
	}

	public void enterPasswrdforSignIn(String pass) {
		driver.findElement(passowrd).sendKeys(pass);
	}

	public void clikedonsigninbtn() {
		driver.findElement(signInbutton).click();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
