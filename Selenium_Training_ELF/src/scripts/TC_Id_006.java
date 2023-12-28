package scripts;

import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import element_repo.AddToCartButtonPage;
import element_repo.CheckOutPage;
import element_repo.ShoppingCartPage;
import generic_lib.Excel_Data;

/***
 * @author Dayasindhu.N
 */
public class TC_Id_006 {
	@Test
	public void registerAndAddToCart() {
		LocalDateTime ltd = LocalDateTime.now();
		String temp = "" +ltd.getSecond();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Daya");
		driver.findElement(By.id("LastName")).sendKeys("Nagesh");
		driver.findElement(By.id("Email")).sendKeys("dayan"+temp+"@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Daya@"+temp);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Daya@"+temp);
		
		driver.findElement(By.id("register-button")).click();
		
		AddToCartButtonPage item = new AddToCartButtonPage(driver);
		item.getComputers().click();
		item.getDesktops().click();
		Actions action = new Actions(driver);
		action.scrollByAmount(100, 100).perform();
		item.getProduct().click();
		item.getProductId().click();
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