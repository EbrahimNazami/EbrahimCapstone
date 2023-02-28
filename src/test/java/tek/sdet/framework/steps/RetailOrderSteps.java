package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	
	
	
	
	
	
	// ------- Cancel Order ------------

	@And ("User click on Orders section")
	public void userClickOnOrdersSection() {
		
	}
	@And ("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	click(factory.orderPage().Orderbutton);	
	logger.info("click on order");
	slowDown();
	
	}
	@And ("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton(){
	click(factory.orderPage().cancelbuttom);
	logger.info("click on cancel");
	
	}
	@And ("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String resone){
	selectByVisibleText(factory.orderPage().cancelReson,resone);
	logger.info("choose the resone");
	
	}	
	@And ("User click on Cancel button")
	public void userClickOnCancelButton(){
	click(factory.orderPage().CancelOrder);	
	logger.info("ordercancelled");
	
	}	
	@Then ("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMassageShouldBeDisplayed() {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().CancelOrder));	
	logger.info("order canceled successfully");
	}
		
		
	
	
	
	
	
	// -------------- Return Order -----------------
		
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	click(factory.orderPage().returnOption);
	logger.info("click on return ");
	slowDown();
	
	}
	@And ("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String resone) {
	selectByVisibleText(factory.orderPage().resoneReturnCapstone,resone); 
	logger.info(" Choose return resone");
	
	}
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String DropOf) {
	selectByVisibleText(factory.orderPage().dropOffInput,DropOf);
	logger.info("choose drop of location");
	
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	click(factory.orderPage().returnButton);
	logger.info("item returned");
	
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String str) {
		String expect = str;
	    String actual =getElementText(factory.orderPage().retutnOrderMessage);
	    Assert.assertEquals(actual, expect);
	    logger.info("the message was displayed");}   
		
		
		
	
	
	
	
	// -----------Review Order ----------	
		
	@When ("User click on Review button")
	public void userClickOnReviowButton() {
	click(factory.orderPage().Review);
	logger.info("add Review");
	
	}	
	@And("User write Review headline {string} and text  {string}")
	public void userWriteReviewHeadlineSecoundAndTextILikeThisItem( String string,String string1) {
	sendText(factory.orderPage().Headlin ,string);
	sendText(factory.orderPage().TextArea,string1);
	logger.info("user review the order");
	
	} 
	@And ("User click Add your Review button")
	public void userClickAddYourReviowButton() {
	click(factory.orderPage().AddReview);
	logger.info("click on add review");
	
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String string) {
	String expect =string;
	String actual = getElementText(factory.orderPage().AddReview);
	Assert.assertEquals(actual,expect);
	logger.info("review the order");
		
		
		
		
	}
	}
	

