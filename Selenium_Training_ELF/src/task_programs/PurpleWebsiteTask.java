package task_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurpleWebsiteTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.purplle.com/");
		driver.findElement(By.xpath("//a[contains(text(),'SHOP CATEGORIES')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Makeup')]/..//a[contains(text(),'SHOP CATEGORIES')]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'Good Vibes Cherry Moisture Rich Red Tinted Lip Balm ')]/../..//a[contains(text(),'Add to Cart')]")).click();
	}
}