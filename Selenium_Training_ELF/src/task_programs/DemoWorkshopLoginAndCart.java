package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkshopLoginAndCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Dayasindhu");
		driver.findElement(By.id("LastName")).sendKeys("Nagesh");
		driver.findElement(By.id("Email")).sendKeys("dayan29@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Fauysuy@4423");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Fauysuy@4423");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.partialLinkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("dayan29@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Fauysuy@4423");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("Electronics")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Cell phones")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("img[title='Show details for Smartphone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-43")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		driver.quit();
	}
}