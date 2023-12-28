package dropdown_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownOfFacebook {
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
		
		System.out.println(daySelect.isMultiple());
		
		daySelect.selectByVisibleText("25");
		monthSelect.selectByIndex(0);
		yearSelect.selectByValue("2016");
		
		driver.quit();
	}
}