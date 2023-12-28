package locators_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIDLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("dayan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Daya@972000");
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}