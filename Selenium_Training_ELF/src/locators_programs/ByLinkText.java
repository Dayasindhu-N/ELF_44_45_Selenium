package locators_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(15000);
		driver.findElement(By.id("loginclose1")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dining & Kitchen")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("6 Seater Dining Table Sets")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}