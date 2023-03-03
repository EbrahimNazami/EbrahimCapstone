package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expected = "React App";
		String actual = getTitle();
		Assert.assertEquals(expected, actual);
		logger.info(expected+" is equal to "+actual);
	   
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("User clicked on sign in button");
	
	}
	
	@And ("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("User enter email and password");
		
	}
	@And ("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("User click on lognin Button");
		
	}
	@Then ("User should be logged in into Account")
	public void userShoulBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("user should be logged in into Account");
		
	}
	
	
	@And("User click on Create New Account button")
	public void userClickOnCreatNewAccount() {
		click(factory.signInPage().CreatNewAccountButton);
		logger.info("User Click On Creat New Account");
		
	}
	
	@And ("User fill the signUp information with below data")
	public void userFillTheSignUpInformation(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameField, map.get(0).get("name"));
		sendText(factory.signInPage().emailNewAccountField, map.get(0).get("email"));
		sendText(factory.signInPage().passwordNewAccountField,map.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordField, map.get(0).get("confirmPassword"));
		logger.info("User send the follow texts");
		
	}
	@And ("User click on SignUp button")
	public void userClickOnSignUpButoon() {
		click(factory.signInPage().signUpButton);
		logger.info("user click on signup button");
	}
	@Then ("User should be logged into account page")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("user should see teklogo");
		
	}
	
}
