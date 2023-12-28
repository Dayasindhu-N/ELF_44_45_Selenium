package locators_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("dayan29@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hbuy@jy29");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
}