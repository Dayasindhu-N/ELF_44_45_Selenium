package dummy_programs_for_batch_execution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttributes {
	
	@Test(priority = -1, invocationCount = 3, threadPoolSize = 2, groups = "Smoke")
	public void tata() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.tatamotors.com/");
		driver.quit();
	}
	
	@Test(priority = -4,invocationCount = 3, threadPoolSize = 2, groups = {"Smoke","Regression"})
	public void mahindra() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://auto.mahindra.com/");
		driver.quit();
	}
	
	@Test(priority = -4,invocationCount = 2, threadPoolSize = 1, enabled = true, groups = "Functional")
	public void suzuki() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.marutisuzuki.com/");
		driver.quit();
	}
}