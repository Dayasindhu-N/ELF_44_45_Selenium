package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement usernameTextBox = driver.findElement(By.id("Email"));
		usernameTextBox.clear();
		usernameTextBox.sendKeys("dayan29@gmail.com");
		Thread.sleep(2000);
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("6525565");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String errorMessage = driver.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		System.out.println(errorMessage);
		driver.quit();
//		String errorMessage = driver.findElement(By.cssSelector("span[class='field-validation-error']")).getText();
//		System.out.println(errorMessage);
//		driver.quit();
	}
}