package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import element_repo.AddToCartButtonPage;
import element_repo.CheckOutPage;
import element_repo.ShoppingCartPage;
import generic_lib.BaseScripts;
import generic_lib.Excel_Data;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_007 extends BaseScripts{
	@Test
	public void placingOrder() {
		AddToCartButtonPage item = new AddToCartButtonPage(driver);
		item.getElectronics().click();
		item.getCellPhones().click();
		item.getSmartphones().click();
		item.getSmartPhoneCartButton().click();
		item.getShoppingCartLink().click();
		
		ShoppingCartPage p1 = new ShoppingCartPage(driver);
		p1.getCheckBox().click();
		p1.getCheckoutButton().click();
		
		CheckOutPage c1 = new CheckOutPage(driver);
		c1.getFirstName().clear();
		c1.getLastName().clear();
		c1.getEmail().clear();
		c1.getFirstName().sendKeys(Excel_Data.readStringData("Sheet2", 2, 1));
		c1.getLastName().sendKeys(Excel_Data.readStringData("Sheet2", 3, 1));
		c1.getEmail().sendKeys(Excel_Data.readStringData("Sheet2", 4, 1));
		c1.getCompanyName().clear();
		c1.getCompanyName().sendKeys(Excel_Data.readStringData("Sheet2", 5, 1));
		WebElement countryName = c1.getCountryId();
		Select select = new Select(countryName);
		select.selectByVisibleText("India");
		c1.getCityName().sendKeys(Excel_Data.readStringData("Sheet2", 6, 1));
		c1.getAddress1().sendKeys(Excel_Data.readStringData("Sheet2", 7, 1));
		c1.getAddress2().sendKeys(Excel_Data.readStringData("Sheet2", 8, 1));
		c1.getPincode().sendKeys(Excel_Data.readStringData("Sheet2", 9, 1));
		c1.getPhoneNumber().sendKeys(Excel_Data.readStringData("Sheet2", 10, 1));
		c1.getContinueBilling().click();
		
		c1.getContinueShippingAddress().click();
		
		c1.getSecondDayAir().click();
		c1.getContinueShippingMethod().click();
		
		c1.getCashOnDelivery().click();
		c1.getContinuePaymentMethod().click();
		
		c1.getContinuePaymentInfo().click();
		
		c1.getConfirmOrderButton().click();
		
	}
}