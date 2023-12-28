package action_class_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InfiniteScrolling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.get("https://onepagelove.com/");
		
		Actions action = new Actions(driver);
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Parrot Dynamics")).click();
				break;
			} catch (NoSuchElementException e) {
				action.scrollByAmount(0, 1200).perform();
			}
		}
	}
}