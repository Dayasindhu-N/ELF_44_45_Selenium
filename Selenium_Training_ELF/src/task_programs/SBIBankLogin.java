package task_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIBankLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(2000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		Thread.sleep(2000);
		
		Set<String> windowID = driver.getWindowHandles();
		
		for (String lv : windowID) {
			driver.switchTo().window(lv);
			Thread.sleep(1000);
			if (driver.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0")) {
				driver.findElement(By.name("nextStep")).click();
				driver.findElement(By.id("userName")).sendKeys("DayasindhuN29");
				driver.findElement(By.id("accountNo")).sendKeys("64202891569");
				driver.findElement(By.id("mobileNo")).sendKeys("9739261797");
				driver.findElement(By.id("datepicker5")).sendKeys("17/07/2000");
				driver.findElement(By.name("captchaValue")).sendKeys("JAU63HN");
				driver.findElement(By.name("Submit")).click();
			}
		}
	}
}