package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCopyAndPasteValues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("dayan907@gmail.com",Keys.CONTROL+"a"+"c");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
		driver.quit();
	}
}