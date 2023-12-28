package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessageCssValueCheck {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/register");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SPANISH")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//button[text()='Sign Up ']")).click();
		WebElement errorMessage = driver.findElement(By.id("first_name-error"));
		System.out.println(errorMessage.getCssValue("color"));
		System.out.println(errorMessage.getCssValue("display"));
		driver.quit();
	}
}