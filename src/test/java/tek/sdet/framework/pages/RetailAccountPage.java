package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	
//	--------- Change Name and Phone ----------------
	
	@FindBy (xpath = "//a[@id='accountLink']")
	public WebElement accountOption;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement changeNameField;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneField;
	
	@FindBy (xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateNameAndPhone;
	
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;
	
	
	
	
	
	
//	----------Change Password ---------------------
	
	@FindBy (id = "previousPasswordInput")
	public WebElement previousPassword;
	
	@FindBy (xpath = "//input[@id='newPasswordInput']")
	public WebElement newChangePassword;
	
	@FindBy (xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmChangePassword;
	
	@FindBy (xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordButton;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement changePasswordMessagePopUp;
	
	
	
	
	
	
	
//	------------Add Payment Method ----------------
	
	@FindBy (xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement addPaymentLink;
	
	@FindBy(id ="cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(xpath ="//input[@id='nameOnCardInput']")
	public WebElement nameOncard;
	
	@FindBy(id ="expirationMonthInput")
	public WebElement expirationMonthDropDown;
	
	@FindBy(id ="expirationYearInput")
	public WebElement exprirationYearDropDown;
	
	@FindBy(xpath ="//input[@id='securityCodeInput']")
	public WebElement securityCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSublitButton;
	
	@FindBy (xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentMethodMessagePopUp;
	
	
	
	
	
	
	
//	----------- Edit Payment Method ----------------
	
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement paymentEdit;
	
	@FindBy (xpath = "//button[contains(text(),'Edit')]")
	public WebElement editPaymentMethodLink;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardButton;
	
	@FindBy (xpath ="//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentUpdatePopUp;
	
	
	
	
	
	
//	---------- Remove Payment Method ---------------
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement removePayment;
	
	@FindBy(xpath = "//h1[contains(text(),'Wallet')]")
	public WebElement walletText;
	
	
	
	
	
	
	
//	------------ Add Address -----------------------
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddresslink;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryDropDown;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameOnAddress;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberOnAddress;
	
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement Street;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement APT;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement City;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateDropDown;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement ZipCoade;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addAddressMessage;
	
	
	
	
	
	
//	----------- Edit Address ----------------
	
	@FindBy(xpath ="//button[contains(text(),'Edit')]")
	public WebElement editAddressLink;
	
	@FindBy(xpath ="//button[@id='addressBtn']")
	public WebElement updatYourAddressButton;
	
	@FindBy(xpath= "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdateMessage;
	
	
	
	
	
	
//	---------- Remove Address --------------
	
	@FindBy (xpath = "//button[contains(text(),'Remove')]")
	public WebElement RemoveAddressLink;
	
	@FindBy (xpath = "//img[@id='profileImage']")
	public WebElement ProfilePicture;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
