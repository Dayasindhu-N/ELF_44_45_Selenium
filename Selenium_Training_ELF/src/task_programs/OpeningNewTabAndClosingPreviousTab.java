package task_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewTabAndClosingPreviousTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.maybelline.co.in/");
		String parentID = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.nykaafashion.com/");
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(10000);
		Set<String> allWindowId = driver.getWindowHandles();
		for (String lv : allWindowId) {
			driver.switchTo().window(lv);
			if (driver.getTitle().contains("Buy Men's Clothing, Accessories & Fashion: Where Style Meets Quality")) {
				driver.findElement(By.partialLinkText("Careers")).click();
				break;
			}
		}
		driver.switchTo().window(parentID).close();
	}
}