package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "termsofservice")
	private WebElement checkBox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	@FindBy(name = "removefromcart")
	private WebElement removingFromCart;
	
	public WebElement getUpdatingCart() {
		return updatingCart;
	}

	@FindBy(name = "updatecart")
	private WebElement updatingCart;
	
	public WebElement getRemovingFromCart() {
		return removingFromCart;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
}