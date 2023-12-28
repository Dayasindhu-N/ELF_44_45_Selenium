package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryValueCapturing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SPANISH")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement valueEntered1 = driver.findElement(By.id("email"));
		valueEntered1.clear();
		valueEntered1.sendKeys("daya36@gmail.com");
		String value = valueEntered1.getAttribute("value");
		System.out.println(value);
		Thread.sleep(1000);
		WebElement valueEntered2 = driver.findElement(By.name("password"));
		valueEntered2.clear();
		valueEntered2.sendKeys("356290");
		String value2 = valueEntered2.getAttribute("value");
		System.out.println(value2);
		Thread.sleep(1000);
		driver.quit();
	}
}