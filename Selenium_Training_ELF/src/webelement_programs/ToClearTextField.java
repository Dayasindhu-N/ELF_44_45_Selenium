package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTextField {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextBox = driver.findElement(By.id("username"));
		usernameTextBox.clear();
		usernameTextBox.sendKeys("daya");
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("6525565");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(5000);
		driver.quit();
	}
}