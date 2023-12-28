package task_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersstackCheckButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[contains(@alt,'Skinny Men Blue Jeans')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560001");
		WebElement button = driver.findElement(By.id("Check"));
		
		while (!button.isEnabled()) {}
		button.click();
		driver.quit();
	}
}