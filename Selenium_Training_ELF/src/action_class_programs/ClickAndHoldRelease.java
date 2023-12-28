package action_class_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldRelease {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.paiinternational.in/");
		
		WebElement ele = driver.findElement(By.partialLinkText("Select Category"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		
		driver.findElement(By.id("furniture-2")).click();
		
		WebElement fromEle = driver.findElement(By.xpath("//span[contains(@class,'slider from')]"));
		WebElement toEle = driver.findElement(By.xpath("//span[contains(@class,'slider to')]"));
		
		actions.clickAndHold(fromEle).moveByOffset(10, 0).release(fromEle).perform();
		Thread.sleep(2000);
		actions.moveToElement(toEle).clickAndHold().moveByOffset(-20, 0).release().perform();
		
//		actions.dragAndDropBy(fromEle, 30, 0).perform();
//		actions.dragAndDropBy(toEle, -35, 0).perform();
		
		driver.quit();
	}
}