package browser_actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAllWindowIDs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/dayas/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(4000);
		Set<String> allWindowId = driver.getWindowHandles();
		
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}
}