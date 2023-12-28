package element_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends HomePage {

	public CategoryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement Desktops;

	public WebElement getDesktops() {
		return Desktops;
	}
}