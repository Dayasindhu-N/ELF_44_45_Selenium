package task_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkshopTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("dayan29@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Fauysuy@4423");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.cssSelector("img[title='Show details for Smartphone']")).click();
		driver.findElement(By.id("add-to-cart-button-43")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Phone Cover')]")).click();
		driver.findElement(By.id("add-to-cart-button-80")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Blue and green Sneaker')]")).click();
		driver.findElement(By.id("add-to-cart-button-28")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		List<WebElement> itemPrice = driver.findElements(By.id("//span[@class='product-unit-price']"));
		itemPrice.add(null);
	}
}