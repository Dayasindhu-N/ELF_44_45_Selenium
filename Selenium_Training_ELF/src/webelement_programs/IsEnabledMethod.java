package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//img[contains(@alt,'Skinny Men Blue Jeans')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560001");
		Thread.sleep(6000);
		System.out.println(driver.findElement(By.id("Check")).isEnabled());
		driver.quit();
	}
}