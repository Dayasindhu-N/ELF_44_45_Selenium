package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstName;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastName;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "BillingNewAddress_Company")
	private WebElement companyName;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryId;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityName;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1;

	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement address2;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement pincode;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getCountryId() {
		return countryId;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getContinueBilling() {
		return continueBilling;
	}

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement continueBilling;

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement continueShippingAddress;

	public WebElement getContinueShippingAddress() {
		return continueShippingAddress;
	}

	@FindBy(id = "shippingoption_0")
	private WebElement groundTime;

	@FindBy(id = "shippingoption_1")
	private WebElement nextDayAir;

	@FindBy(id = "shippingoption_2")
	private WebElement secondDayAir;

	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethod;

	public WebElement getGroundTime() {
		return groundTime;
	}

	public WebElement getNextDayAir() {
		return nextDayAir;
	}

	public WebElement getSecondDayAir() {
		return secondDayAir;
	}

	public WebElement getContinueShippingMethod() {
		return continueShippingMethod;
	}
	
	@FindBy(id = "paymentmethod_0")
	private WebElement cashOnDelivery;
	
	@FindBy(id = "paymentmethod_1")
	private WebElement moneyOrder;
	
	@FindBy(id = "paymentmethod_2")
	private WebElement creditCard;
	
	@FindBy(id = "paymentmethod_3")
	private WebElement purchaseOrder;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement continuePaymentMethod;

	public WebElement getCashOnDelivery() {
		return cashOnDelivery;
	}

	public WebElement getMoneyOrder() {
		return moneyOrder;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getPurchaseOrder() {
		return purchaseOrder;
	}

	public WebElement getContinuePaymentMethod() {
		return continuePaymentMethod;
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement continuePaymentInfo;

	public WebElement getContinuePaymentInfo() {
		return continuePaymentInfo;
	}
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}
}