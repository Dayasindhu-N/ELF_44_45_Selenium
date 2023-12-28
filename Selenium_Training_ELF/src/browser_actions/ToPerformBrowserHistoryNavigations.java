package browser_actions;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.britannia.co.in/");
		driver.get("https://www.sunfeastworld.com/");
		//driver.get("https://www.oreo.com/");
		driver.navigate().to("https://parleproducts.com/");
		
		Thread.sleep(2000);
		Navigation navigation = driver.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.back();
		Thread.sleep(2000);
		navigation.forward();
		Thread.sleep(2000);
		navigation.refresh();
		
		driver.quit();
	}
}