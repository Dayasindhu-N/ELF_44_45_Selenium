package task_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OoklaSpeedTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.speedtest.net/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@data-google-container-id,'5')]"));
		Thread.sleep(5000);
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("cbb")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
}