package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRaryLanguageChanging {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("SPANISH")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("dayan29@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("235521454");
		Thread.sleep(1000);
		driver.findElement(By.id("usertype_yes")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("groupcode")).sendKeys("TYSS123");
		Thread.sleep(1000);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(1000);
	}
}