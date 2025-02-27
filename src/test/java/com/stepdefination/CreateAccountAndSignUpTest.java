package com.stepdefination;

import org.junit.Assert;

import com.browserfactory.DriverFactory;
import com.pages.CreateAccountAndSignIn;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountAndSignUpTest {

	// ToDo : mapping test data from feature file to here

	private CreateAccountAndSignIn account = new CreateAccountAndSignIn(DriverFactory.getDriver());

	@Given("User is on the home page")
	public void user_is_on_the_home_page() {

		DriverFactory.getDriver().get(" https://magento.softwaretestingboard.com/");
	}

	@When("User click on CreateAccount which is on Home page")
	public void user_click_on_create_account_filed() throws Exception {
		account.clickonCreateAccountonHomePage();
	}

	@When("User enter firstName as {string} into the firstName field")
	public void user_enter_first_name_as_into_the_first_name_field(String firstName) {
		account.enterfirstName(firstName);
	}

	@When("User enter lastName as {string}   into the lastName field")
	public void user_enter_last_name_as_into_the_last_name_field(String lastName) {
		account.enterlastName(lastName);
	}

	@When("User enter email as {string} into the email field")
	public void user_enter_email_as_into_the_email_field(String email) {
		account.enterEmail(email);
	}

	@When("User enter password as {string}  into the password field")
	public void user_enter_password_as_admin_into_the_password_field(String password) {
		account.enterPassword(password);
	}

	@When("User enter confirm password {string} into the confirm password field")
	public void user_enter_confirm_password_into_the_confirm_password_field(String confirmpassword) {
		account.enterConfirmPassword(confirmpassword);
	}

	@Then("User click on create Account button")
	public void user_click_on_create_account_button() {
		account.clikonButton();
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println("--> User Account has successfully created ");
	}

	@Then("the new page URL should contain {string}")
	public void logged_in_Msg1(String expectedTitle) throws Exception {
		Thread.sleep(2000);
		Assert.assertEquals(account.getCurrentUrl(), expectedTitle);
	}

	@Then("the new page contain text {string}")
	public void accountCreateMsg(String expectedMsg) throws Exception {
		Thread.sleep(2000);
		Assert.assertEquals(account.confirmMsg(), expectedMsg);
	}

	// signIn
	@Given("User is on the home page SignIn")
	public void back_to_homepage() throws Exception {
		Thread.sleep(2000);
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login");
	}

	@Then("click on signin")
	public void cliksign() {
		account.clickonsignIn();
	}

	@Then("User enter email as {string}")
	public void enteremailsign(String eml) {
		account.enterEmailforSignIn(eml);
	}

	@And("User enter password as {string}")
	public void enterpasssign(String pwd) {
		account.enterPasswrdforSignIn(pwd);
	}

	@Then("click on signinbutton")
	public void btnclick() {
		account.clikedonsigninbtn();
	}

}
