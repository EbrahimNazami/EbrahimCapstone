package tek.sdet.framework.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	
	
//	 ------------ Update Account -----------
	
	@When ("User click on Account option")
	public void userCLickOnAccountOptios() {
		click(factory.accountPage().accountOption);
		logger.info("User Click On Account Option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().changeNameField);
		sendText(factory.accountPage().changeNameField, name);
		sendText(factory.accountPage().phoneField, phone);
		logger.info("User Update Name on Account");
	}
	@And ("User click on Update button")
	public void userClicOnUpdateButton() {
		click(factory.accountPage().updateNameAndPhone);
		logger.info("User Click On Update Button");
		
	}
	@Then ("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("User Profile Information Should Be Updated");
	}
	
	
	
	
//	------------- Update Password ------------
	
	@When("User enter below information")
	public void userEnterBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, map.get(0).get("previousPassword"));
		sendText(factory.accountPage().newChangePassword, map.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmChangePassword, map.get(0).get("confirmPassword"));
		logger.info("User entered the below information");
	}
	
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("User Click On Change Password Button");
	}
	
	@Then("a Profile Update message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().changePasswordMessagePopUp);
		String message="Password Updated Successfully";
		String result = getElementText(factory.accountPage().changePasswordMessagePopUp);
		Assert.assertEquals(message, result);
		logger.info("password changed");
	}

	
	
	
	
//	    ------------ Add Payment Method -----------
	
	@And ("User click on Add a payment method link")
	public void userClickOnAddaPaymentMethodLink() {
		click(factory.accountPage().addPaymentLink);
		logger.info("User click on Add Payment Link");
	}
	
	@And ("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> cardinfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumber, cardinfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOncard, cardinfo.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMonthDropDown, cardinfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().exprirationYearDropDown, cardinfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, cardinfo.get(0).get("securityCode"));
		logger.info("user Fill Debit or Credit Card Information");
	}
	
	@And ("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSublitButton);
		logger.info("user Click on Add Your Card Button");
	}
	
	@Then ("an Update Payment message should be displayed {string}")
	public void paymentMessage(String string) {
		waitTillPresence(factory.accountPage().paymentMethodMessagePopUp);
		String  message = string;
		String result = getElementText(factory.accountPage().paymentMethodMessagePopUp);
		Assert.assertEquals(message, result);
		logger.info("Payment Method added Successfully");
	}
	
	
	
	
	
	
//	------------ Edit Payment Method --------------
	
	@And ("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().paymentEdit);
		logger.info("User Click on Edit Payment Method");
	}
	
	@And ("User click on edit link")
	public void userClickOnEditLink() {
		click(factory.accountPage().editPaymentMethodLink);
		logger.info("User Click on Edit Link");
	}
	
	@And ("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> payment = dataTable.asMaps(String.class, String.class);
		
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		sendText(factory.accountPage().cardNumber,payment.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOncard);
		sendText(factory.accountPage().nameOncard,payment.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthDropDown, payment.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().exprirationYearDropDown,payment.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		sendText(factory.accountPage().securityCode,payment.get(0).get("securityCode"));
		logger.info("userDebitOrCreditCardInformation");
		}
	
	
	@And ("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("User Click On Update Your Card Button");
	}

	@Then("a message should be displayed'Payment Method updated Successfully'")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentUpdatePopUp);
		String  message = "Payment Method updated Successfully";
		String result = getElementText(factory.accountPage().paymentUpdatePopUp);
		Assert.assertEquals(message, result);
		logger.info("Payment Method updated Successfully");
	}
	
	
	
	
	
	
//	------------ Remove Payment Method ----------------------
	
	@And ("User click on remove link of card section")
	public void userclickOnEditOptionOfCardSection() {
		click(factory.accountPage().paymentEdit);
		logger.info("User Click on Edit Payment Method");
	}
	
//	@And ("User click on remove option of card section")
//	public void userClickOnRemoveOptionOfCardSections() {
//		click(factory.accountPage().removePayment);
//		logger.info("User click on remove option");
//	}
	
//	@Then("payment details should be removed")
//	public void paymentDetailsShouldBeRemove() {
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().walletText));
//		logger.info("payment details should be removed");
//	}

	
	
	
	
	
	
//	------------ Add Address ------------------
	
	@And ("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddresslink);
		logger.info("user click on add address option");
	}
	
	@And ("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation1(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> addAddress = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().countryDropDown, addAddress.get(0).get("country"));
		sendText(factory.accountPage().fullNameOnAddress, addAddress.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberOnAddress, addAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().Street, addAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().APT, addAddress.get(0).get("apt"));
		sendText(factory.accountPage().City, addAddress.get(0).get("City"));
		sendText(factory.accountPage().stateDropDown, addAddress.get(0).get("state"));
		sendText(factory.accountPage().ZipCoade, addAddress.get(0).get("zipCode"));
		logger.info("user fill new address form with below information");
	}
	
	@And ("User click Add Your Address button")
	public void usreClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user click on add your address button");
	}
	
	@Then ("an update address message should be displayed {string}")
	public void anAddAddressMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().addAddressMessage);
		String  message = string;
		String result = getElementText(factory.accountPage().addAddressMessage);
		Assert.assertEquals(message, result);
	}

	
	
	
	
	
//	------------- Edit Address -----------------
	
	@And ("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressLink);
		logger.info("user click on edit address option");
	}
	
	@ And ("user fill new  update address form with below information")
	public void userFillNewAddressFormWithBelowInforamtion(DataTable dataTable) {
		List<Map<String, String>> editAddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropDown, editAddress.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameOnAddress);
		sendText(factory.accountPage().fullNameOnAddress, editAddress.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberOnAddress);
		sendText(factory.accountPage().phoneNumberOnAddress, editAddress.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().Street);
		sendText(factory.accountPage().Street, editAddress.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().APT);
		sendText(factory.accountPage().APT, editAddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().City);
		sendText(factory.accountPage().City, editAddress.get(0).get("City"));
		clearTextUsingSendKeys(factory.accountPage().stateDropDown);
		selectByVisibleText(factory.accountPage().stateDropDown, editAddress.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().ZipCoade);
		sendText(factory.accountPage().ZipCoade, editAddress.get(0).get("zipCode"));
		logger.info("user fill new address form with below information");
	}
	
	@And ("User click update Your Address button")
	public void userCLickUpdateYourAddressButton() {
		click(factory.accountPage().updatYourAddressButton);
		logger.info("user click update your address button");
	}
	
	@Then ("an edit address message should be displayed {string}")
	public void anEditAddressMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().addressUpdateMessage);
		String message = string;
		String result = getElementText(factory.accountPage().addressUpdateMessage);
		Assert.assertEquals(message, result);
		
	}
	
	
	
	
	
	
	//------------- Remove Payment Method -------------
	
		@And ("User click on remove option of card section")
		public void userClickOnRemoveOptionOfVardSection() {
		click(factory.accountPage().removePayment);
		logger.info("user removed the payment");
	   	
		}
		
		@Then ("payment details should be removed")
		public void paymentDetailsShouldbeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addPaymentLink));	
		logger.info("payment details should be remove");
		}
		
		
		
		
		
		
}
