package action_class_programs;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://parivahan.gov.in/parivahan/");
		
		Actions actions = new Actions(driver);
		List<WebElement> navBarElement = driver.findElements(By.xpath("//li[@data-type='menu_item' and @data-level='1']"));
		
		for (WebElement navElement : navBarElement) {
			actions.keyDown(Keys.CONTROL).perform();
			navElement.click();
			actions.keyUp(Keys.CONTROL).perform();
		}
		
		Set<String> windowsId = driver.getWindowHandles();
		for (String window : windowsId) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if (title.contains("Contact Us")) {
				driver.close();
				break;
			}
		}
		
		driver.quit();
	}
}