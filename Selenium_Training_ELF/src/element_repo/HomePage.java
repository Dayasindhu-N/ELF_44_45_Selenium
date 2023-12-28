package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText = "Computers")
	private WebElement Computers;
	
	@FindBy(id = "newsletter-email")   
	private WebElement newsLetterTextBox;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement newsLetterSubscribeButton;
	
	public WebElement getComputers() {
		return Computers;
	}
	
	public WebElement getNewsLetterTextBox() {
		return newsLetterTextBox;
	}

	public WebElement getNewsLetterSubscribeButton() {
		return newsLetterSubscribeButton;
	}
}