package action_class_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		WebElement navBarElement = driver.findElement(By.xpath("//div[contains(text(),'Home Appliances')]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(navBarElement).contextClick().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Split Air Conditioners')]")).click();
		driver.quit();
	}
}