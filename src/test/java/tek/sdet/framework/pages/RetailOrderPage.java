package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
}
	
	
	
	
// ------- Cancel Order ----------
	
@FindBy(id ="orderLink")
public WebElement Orderbutton;
	
@FindBy(xpath="//span[@class='orders__count']")	
public WebElement Ordercount;
	
@FindBy(xpath = "//button[text()='Cancel The Order']")
public WebElement cancelbuttom;
	
@FindBy(xpath="//select[@id= 'reasonInput']")
public WebElement cancelReson;
	
	
@FindBy(xpath = "//button[@id='orderSubmitBtn']")
public WebElement CancelOrder;
	
	
	



	
// ----------- Return Order ------------

@FindBy(id="returnBtn")
public WebElement returnOption;

@FindBy(id="dropOffInput")
public WebElement dropOffInput;

@FindBy(id= "reasonInput")
public WebElement resoneReturnCapstone;

@FindBy(xpath="//button[@id='orderSubmitBtn']")
public WebElement returnButton;

@FindBy(xpath="//p[text()='Return was successfull']")
public WebElement retutnOrderMessage;






// -------------- Review order -------------

@FindBy(id="reviewBtn")
public WebElement Review;

@FindBy(id = "headlineInput")
public WebElement Headlin;

@FindBy(xpath ="//textarea[@id='descriptionInput']" )
public WebElement TextArea;

@FindBy(xpath ="//button[text()='Add Your Review']")
public WebElement AddReview;

	
}
