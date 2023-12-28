package scripts;

import org.testng.annotations.Test;

import element_repo.AddToCartButtonPage;
import element_repo.BasePage;
import generic_lib.BaseScripts;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_005 extends BaseScripts {
	@Test
	public void addToWishlist() {
		BasePage page = new BasePage(driver);
		page.getApparalesAndShoes().click();

		AddToCartButtonPage item = new AddToCartButtonPage(driver);
		item.getSneaker().click();
		item.getSneakerWishlist().click();
		
		page.getWishlistLink().click();
	}
}