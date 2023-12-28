package scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import element_repo.AddToCartButtonPage;
import element_repo.ShoppingCartPage;
import generic_lib.BaseScripts;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_004 extends BaseScripts{
	@Test
	public void removeFromCart() {
		AddToCartButtonPage item = new AddToCartButtonPage(driver);
		item.getComputers().click();
		item.getDesktops().click();
		Actions action = new Actions(driver);
		action.scrollByAmount(100, 100).perform();
		item.getProduct().click();
		item.getProductId().click();
		item.getShoppingCartLink().click();
		
		ShoppingCartPage s1 = new ShoppingCartPage(driver);
		s1.getRemovingFromCart().click();
		s1.getUpdatingCart().click();
	}
}