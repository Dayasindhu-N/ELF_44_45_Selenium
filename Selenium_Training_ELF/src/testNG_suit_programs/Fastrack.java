package testNG_suit_programs;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fastrack {
	@Parameters("bname")
	@Test
	public void login(@Optional("chrome") String browser) throws InterruptedException {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("msedge")) {
			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			Reporter.log("Invalid browser name", true);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.fastrack.in/");
		
		Thread.sleep(2000);
		driver.quit();
	}
}