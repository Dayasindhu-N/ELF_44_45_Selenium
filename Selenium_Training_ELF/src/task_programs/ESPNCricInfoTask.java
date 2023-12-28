package task_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESPNCricInfoTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
		WebElement table = driver.findElement(By.xpath("//span[contains(text(),'India')]/../../../..//th[contains(text(),'BATTING')]/../../.."));
		List<WebElement> totalNoOfRows = table.findElements(By.xpath("table/tbody/tr"));
		System.out.println(totalNoOfRows.size());
	}
}