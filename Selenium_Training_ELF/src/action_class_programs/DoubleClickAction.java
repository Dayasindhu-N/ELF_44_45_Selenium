package action_class_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		
		WebElement plusButton = driver.findElement(By.id("add"));
		Actions actions = new Actions(driver);
		actions.doubleClick(plusButton).perform();
		actions.doubleClick(plusButton).perform();
		Thread.sleep(5000);
		actions.moveToElement(driver.findElement(By.id("minus"))).doubleClick().perform();
		
		driver.quit();
	}
}