package tek.sdet.framework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		

		
		
		
	}
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy (id = "password")
	public WebElement passwordField;
	
	@FindBy (xpath = "//button[@id='loginBtn']")
	public WebElement loginButton;
	
	@FindBy(xpath ="//a[contains(text(),'Test Selenium')]")
	public WebElement TestSelenium;
	
	@FindBy(id="newAccountBtn")
	public WebElement CreatNewAccountButton;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameField;
	
	@FindBy(xpath = "//input[@id='emailInput']")
	public WebElement emailNewAccountField;
	
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement passwordNewAccountField;
	
	@FindBy(xpath ="//input[@id='confirmPasswordInput']")
	public WebElement confirmPasswordField;
	
	@FindBy(css = " #signupBtn")
	public WebElement signUpButton;
	
	
	
}

