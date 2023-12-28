package task_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriWebsite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 4150).perform();
		driver.findElement(By.partialLinkText("Trust & safety"));
//		action.scrollToElement(ele).pause(Duration.ofSeconds(3)).click(ele).perform();
		
//		action.click(ele).perform();
		
//		driver.quit();
	}
}