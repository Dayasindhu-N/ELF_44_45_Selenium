package task_programs;

import java.time.Duration;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions action = new Actions(driver);
		driver.get("https://www.flipkart.com/");
		addProduct("Iphone", driver);
		addProduct("poco", driver);
		addProduct("realme", driver);
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 1517).perform();
		driver.findElement(By.xpath("//a[contains(text(),'iPhone')]/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
	}
	
	public static void addProduct(String name,WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@loading='eager']")));
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@loading='eager']")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowId);
		for (String windowId : allWindowHandles) {
			driver.switchTo().window(windowId);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Place Order']")));
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
	}
}