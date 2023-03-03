package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{

	POMFactory factory = new POMFactory();


	
	//------------- Shop By 1 ------------
	
	@When("User click on All section")
	public void userClickOnAllSection() {
    click(factory.homePage().All);
	logger.info("click on all section");
	slowDown();
	
	}
	@Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
        List<List<String>> optionsToDisplay = options.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
               logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
	}
	

	
	
	
	
	
//  ------------- Shop By -------------
	
	  String department;
	   @When("User on {string}")
	    public String userOnElectronics(String department) {
	       switch (department) {
	        case "Electronics":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
	            logger.info("user is on Electronics section");
	            break;
	        case "Computers":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().computer));
	            logger.info("user is on Computers section");
	            break;
	        case "SmartHome":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().smarthome));
	            logger.info("user is on Computers section");
	            break;
	        case "Sports":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
	            logger.info("user is on Sports section");
	            break;
	        case "Automotive":
	            Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
	            logger.info("user is on Automotive section");
	            break;
	        default:
	       }
	       return this.department = department;
	       
	   }
	   @Then("below options are present in department")
	    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	        List<List<String>> department = dataTable.asLists();
	       switch (this.department) {
	        case "Electronics":
	            clickElementWithJS(factory.homePage().electronics);
	            String video = getText(factory.homePage().VideoGames);
	            String TVVideo = getText(factory.homePage().TvAndVideo);
	            Assert.assertEquals(TVVideo, department.get(0).get(0));
	            Assert.assertEquals(video, department.get(0).get(1));
	            logger.info(video + " options are present in department" + TVVideo);
	            break;
	        case "Computers":
	            clickElementWithJS(factory.homePage().computer);
	            String Accessories = getText(factory.homePage().Accessories);
	            String Networking = getText(factory.homePage().Networking);
	            Assert.assertEquals(Accessories, department.get(0).get(0));
	            Assert.assertEquals(Networking, department.get(0).get(1));
	            logger.info(Accessories + " options are present in department" + Networking);
	            break;
	            
	        case "SmartHome":
	            click(factory.homePage().smarthome);
	            String SmartHomeLightning = getText(factory.homePage().smarthomelight);
	            String PlugsandOutlets = getText(factory.homePage().plag);
	            Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));
	            Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
	            logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);
	            break;
	        case "Sports":
	            clickElementWithJS(factory.homePage().Sports);
	            String AthleticClothing = getText(factory.homePage().AthleticClothing);
	            String ExerciseFitness = getText(factory.homePage().ExerciseFitness);
	            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
	            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
	            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
	            break;
	        case "Automotive":
	            clickElementWithJS(factory.homePage().Automative);
	            String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAccessories);
	            String MotorCyclePowersports = getText(factory.homePage().MotorCyclePowersports);
	            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
	            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
	            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
	            break;

	       }

	   }
	
	
	   
	   
	   
	   
	// ---------- Add to Cart ------------
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome){
	selectByVisibleText(factory.homePage().AllDepartment,smartHome);
	logger.info("select smart home");
	
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItem(String Text) {
	sendText(factory.homePage().searchInput,Text);
	logger.info("search some thing");
	
	}
	@And ("User click on Search icon")
	public void userClickOnSerchIcone() {
	click(factory.homePage().SerchBtn);
	logger.info("click on search");
	
	}
	@And("User click on item")
	public void userClickOnItem() {
	click(factory.homePage().itemCapstone);
	logger.info("item add ");
	
	}
	@And ("User select quantity {string}")
	public void userSelectQuantity(String count) {
	selectByVisibleText(factory.homePage().ItemCountCapstone,count);
	logger.info("item count added");
	
	}
	@And ("User click add to Cart button")
	public void userClickAddToCartButton() {
	click(factory.homePage().AddToCartCapstone);
	logger.info("item added to cart");	
	
	}
	@Then ("the cart icon quantity should change to {string}")
	public void theCartIconeQuantityShouldChange(String Qty) {
	Assert.assertTrue(isElementDisplayed(factory.homePage().CartQty));	
	logger.info	("item added to cart successfully");
	
	}
	
	
	
	
	
	
	
	// ------------ Place Order ------------
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
	click(factory.homePage().CartOption); 
	logger.info("place order");
			
	}
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	click(factory.homePage().ProcedCheckout);
	logger.info("click on proceed");
		
	}
	@And ("User click Add Your  new Address")
	public void userClickAddYourNewAddres() {
	click(factory.homePage().addNewAddress);
	logger.info("add Address");
	
	}
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> addAddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropDown, addAddress.get(0).get("country"));
		sendText(factory.accountPage().fullNameOnAddress, addAddress.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberOnAddress, addAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().Street, addAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().APT, addAddress.get(0).get("apt"));
		sendText(factory.accountPage().City, addAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateDropDown, addAddress.get(0).get("state"));
		sendText(factory.accountPage().ZipCoade, addAddress.get(0).get("zipCode"));
		logger.info("user fill new address form with below information");
		
	}
	 @And ("User click Add Your Address button on cart")
	 public void userClickOnAddNewAddressOnCart() {
		 click(factory.homePage().AddYourAddressCartAddress);
		 logger.info("user click on Add Your Address");
	 }
	@And("User click on add new payment")
	public void userClickOnAddNewPayment() {
	click(factory.homePage().AddaCreditOrDebitCard);
	logger.info("click on new payment");
	
	}
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	click(factory.homePage().PalaceOrder); 
	logger.info("placeOrder");
	
	}
	@Then ("there is a massage {string}")
	public void thereIsMessage(String string) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().Confirmition));
		logger.info("order placed");
	}
	

	
	
	
	
	// ------------ Place order 2 --------------
	
	@And ("User click on secound Item")
	public void userClickOnSecoundItem() {
	click(factory.homePage().ApexCoins);
	logger.info("secound item added");
	}
	
	
	}
