package popup_programs;

import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalendar {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		String month = ldt.getMonth().name();
		month = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
//		driver.findElement(By.xpath("//button[@aria-label='Close Message']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close Message']"))).click();
		
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		
		for(;;) {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(day-2)+"']")).click();
				driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		
		
		
	}
}