package task_programs;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwAppTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		
		WebElement goldRateTable = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold Rates Per Gram in  Bangalore')]/../..//table"));
		List<WebElement> totalNoOfRows = goldRateTable.findElements(By.xpath("tbody/tr"));
		System.out.println(totalNoOfRows.size());
		
		for (WebElement row : totalNoOfRows) {
			System.out.print(row.findElement(By.xpath("td")).getText() + " - ");
			System.out.println(row.findElement(By.xpath("td[2]/div/div[1]")).getText());
		}
		driver.quit();
	}
}