package test_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0")) {
				driver.findElement(By.id("nextStep")).click();
				driver.findElement(By.id("userName")).sendKeys("");
			}
		}
	}
}