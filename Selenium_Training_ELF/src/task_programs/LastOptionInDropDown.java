package task_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOptionInDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayListBox);
		Select monthSelect = new Select(monthListBox);
		Select yearSelect = new Select(yearListBox);
		
		int totalNoOfOptions1 = daySelect.getOptions().size();
		daySelect.selectByIndex(totalNoOfOptions1-1);
		
		int totalNoOfOptions2 = monthSelect.getOptions().size();
		monthSelect.selectByIndex(totalNoOfOptions2-1);
		
		int totalNoOfOptions3 = yearSelect.getOptions().size();
		yearSelect.selectByIndex(totalNoOfOptions3-1);
	}
}