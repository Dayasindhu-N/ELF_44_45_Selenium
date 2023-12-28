package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackRegistrationByIdLoc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("First Name")).sendKeys("Dayasindu");
		driver.findElement(By.id("Last Name")).sendKeys("Nag");
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("9591167442");
		driver.findElement(By.id("Email Address")).sendKeys("dayan29@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Dayaaa@907");
		driver.findElement(By.id("Confirm Password")).sendKeys("Dayaaa@907");
		driver.findElement(By.id("Terms and Conditions")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("btnDisabled")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}