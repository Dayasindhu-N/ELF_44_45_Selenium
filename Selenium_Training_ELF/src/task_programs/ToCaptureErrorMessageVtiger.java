package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureErrorMessageVtiger {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("username"));
		email.clear();
		Thread.sleep(1000);
		email.sendKeys("");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
		String errortext=driver.findElement(By.id("validationMessage")).getText();
		System.out.println(errortext);
		//driver.quit();
	}
}