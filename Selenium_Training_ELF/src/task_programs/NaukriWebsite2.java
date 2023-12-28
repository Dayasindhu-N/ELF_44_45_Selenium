package task_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class NaukriWebsite2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		
		Actions action = new Actions(driver);
		
		WebElement ele = driver.findElement(By.linkText("Trust & safety"));
		
		ScrollOrigin src = ScrollOrigin.fromElement(ele);
		
		action.scrollFromOrigin(src, 0, 200).perform();
	}
}