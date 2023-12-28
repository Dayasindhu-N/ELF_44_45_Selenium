package scripts;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import element_repo.AddToCartButtonPage;
import element_repo.CheckOutPage;
import element_repo.ShoppingCartPage;
import generic_lib.BaseScripts;
import generic_lib.Excel_Data;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_002 extends BaseScripts{
	@Test
	public void addToCart() {
		/*Step - To click on the computers*/
		AddToCartButtonPage item = new AddToCartButtonPage(driver);
		item.getComputers().click();
		String expected1 = "https://demowebshop.tricentis.com/computers";
		String actual1 = driver.getCurrentUrl();
		assertEquals(actual1, expected1,"It is not clicked on computers");
		Reporter.log("Clicked on Computers",true);
		
		/*Step - To click on the desktops*/
		item.getDesktops().click();
		String expected2 = "https://demowebshop.tricentis.com/desktops";
		String actual2 = driver.getCurrentUrl();
		assertEquals(actual2, expected2,"It is not clicked on desktops");
		Reporter.log("Clicked on Desktops",true);
		
		/*Step - To click on the specific product*/
		item.getProduct().click();
		String expected3 = "https://demowebshop.tricentis.com/build-your-cheap-own-computer";
		String actual3 = driver.getCurrentUrl();
		assertEquals(actual3, expected3,"It is not clicked on the product");
		Reporter.log("Clicked on the Product",true);
		
		/*Step - To click on the add to cart button*/
		item.getProductId().click();
		String expected4 = "The product has been added to your shopping cart";
		String actual4 = driver.findElement(By.xpath("//p[contains(text(),'The product has been added to')]")).getText();
		assertEquals(actual4, expected4,"It is not clicked on the add to cart button");
		Reporter.log("Clicked on add to cart button",true);
		
		/*Step - To click on the shopping cart link*/
		item.getShoppingCartLinkButton().click();
		String expected5 = "https://demowebshop.tricentis.com/cart";
		String actual5 = driver.getCurrentUrl();
		assertEquals(actual5, expected5,"It is not clicked on the shopping cart button");
		Reporter.log("Clicked on shopping cart",true);
		
		/*Step - To click on the shopping cart link*/
		ShoppingCartPage p1 = new ShoppingCartPage(driver);
		p1.getCheckBox().click();
		Reporter.log("Clicked on checkbox button",true);
		p1.getCheckoutButton().click();
		Reporter.log("Clicked on checkout button",true);
		
		CheckOutPage c1 = new CheckOutPage(driver);
		c1.getFirstName().clear();
		Reporter.log("Cleared the First name textbox",true);
		c1.getLastName().clear();
		Reporter.log("Cleared the last name textbox",true);
		c1.getEmail().clear();
		Reporter.log("Cleared the email textbox",true);
		c1.getFirstName().sendKeys(Excel_Data.readStringData("Sheet2", 2, 1));
		Reporter.log("Entered the data in First name textbox",true);
		c1.getLastName().sendKeys(Excel_Data.readStringData("Sheet2", 3, 1));
		Reporter.log("Entered the data in Last name textbox",true);
		c1.getEmail().sendKeys(Excel_Data.readStringData("Sheet2", 4, 1));
		Reporter.log("Entered the data in email textbox",true);
		c1.getCompanyName().sendKeys(Excel_Data.readStringData("Sheet2", 5, 1));
		Reporter.log("Entered the data in Company name textbox",true);
		WebElement countryName = c1.getCountryId();
		Select select = new Select(countryName);
		select.selectByVisibleText("India");
		Reporter.log("Selected India in country drop down",true);
		c1.getCityName().sendKeys(Excel_Data.readStringData("Sheet2", 6, 1));
		Reporter.log("Entered the data in city name textbox",true);
		c1.getAddress1().sendKeys(Excel_Data.readStringData("Sheet2", 7, 1));
		Reporter.log("Entered the data in Address1 textbox",true);
		c1.getAddress2().sendKeys(Excel_Data.readStringData("Sheet2", 8, 1));
		Reporter.log("Entered the data in Address2 textbox",true);
		c1.getPincode().sendKeys(Excel_Data.readStringData("Sheet2", 9, 1));
		Reporter.log("Entered the data in pincode textbox",true);
		c1.getPhoneNumber().sendKeys(Excel_Data.readStringData("Sheet2", 10, 1));
		Reporter.log("Entered the data in Phone Number textbox",true);
		c1.getContinueBilling().click();
		Reporter.log("Clicked on the Continue button after entering the billing address details",true);
		
		c1.getContinueShippingAddress().click();
		Reporter.log("Clicked on the Continue button after selecting the billing address",true);
		
		c1.getSecondDayAir().click();
		Reporter.log("Selected the time of delivery",true);
		c1.getContinueShippingMethod().click();
		Reporter.log("Clicked on the Continue button after selecting the shipping method",true);
		
		c1.getCashOnDelivery().click();
		Reporter.log("Selected the type of payemnt",true);
		c1.getContinuePaymentMethod().click();
		Reporter.log("Clicked on the Continue button after selecting the payment method",true);
		
		c1.getContinuePaymentInfo().click();
		Reporter.log("Clicked on the Continue button after selecting the payment information",true);
		
		c1.getConfirmOrderButton().click();
		Reporter.log("Clicked on the Confirm button to place the order",true);
		
		String expected = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText();
		String actual = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText();
		
		assertEquals(actual, expected, "Order has not been placed");
		Reporter.log("Order has been placed");
	}
}