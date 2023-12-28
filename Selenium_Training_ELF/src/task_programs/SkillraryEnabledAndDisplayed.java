package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryEnabledAndDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com");
		Thread.sleep(4000);
//		driver.findElement(By.partialLinkText("SPANISH")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("ENGLISH")).click();
//		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("usertype_no")).isSelected());
		System.out.println(driver.findElement(By.id("usertype_yes")).isSelected());
		System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
		Thread.sleep(4000);
		driver.findElement(By.id("usertype_yes")).click();
		System.out.println(driver.findElement(By.id("usertype_yes")).isEnabled());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}
}