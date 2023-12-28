package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink; 
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink; 
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink; 
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink; 
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement books;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computers;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronics;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparalesAndShoes;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloads;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelry;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCards;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getApparalesAndShoes() {
		return apparalesAndShoes;
	}

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}
}
