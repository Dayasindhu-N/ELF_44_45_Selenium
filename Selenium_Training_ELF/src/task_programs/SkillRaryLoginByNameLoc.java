package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRaryLoginByNameLoc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("dayan29@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dayan@907");
		driver.findElement(By.name("captcha")).sendKeys("hd2h7jt");
		Thread.sleep(2000);
		driver.quit();
	}
}