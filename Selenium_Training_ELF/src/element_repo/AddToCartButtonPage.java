package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartButtonPage extends ProductPage {

	public AddToCartButtonPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "add-to-cart-button-72")
	private WebElement productId;
	
	@FindBy(id="add-to-wishlist-button-28")
	private WebElement sneakerWishlist;
	
	@FindBy(id="add-to-cart-button-43")
	private WebElement smartPhoneCartButton;
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement shoppingCartLinkButton;
	
	public WebElement getShoppingCartLinkButton() {
		return shoppingCartLinkButton;
	}

	public WebElement getSmartPhoneCartButton() {
		return smartPhoneCartButton;
	}

	public WebElement getSneakerWishlist() {
		return sneakerWishlist;
	}

	public WebElement getProductId() {
		return productId;
	}
}
