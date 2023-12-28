package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends CategoryPage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Build your own cheap computer']")
	private WebElement product;
	
	@FindBy(partialLinkText = "Blue and green Sneaker")
	private WebElement sneaker;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhones;
	
	@FindBy(partialLinkText = "Smartphone")
	private WebElement Smartphones;
	
	public WebElement getCellPhones() {
		return cellPhones;
	}

	public WebElement getSmartphones() {
		return Smartphones;
	}

	public WebElement getSneaker() {
		return sneaker;
	}

	public WebElement getProduct() {
		return product;
	}
}