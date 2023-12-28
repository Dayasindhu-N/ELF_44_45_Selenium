package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FavoriteIconCssValueCheck {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("dayasindhun29@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Leela@007");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addToWishlist")).click();
	}
}