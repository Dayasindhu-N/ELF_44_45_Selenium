package generic_lib;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;

public class BaseScripts {
	protected ChromeDriver driver = null;

	@BeforeSuite
	public void BeforeSuite() {
	}

	@BeforeTest
	public void BeforeTest() {
	}

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys(Excel_Data.readStringData("Sheet2", 0, 1));
		driver.findElement(By.id("Password")).sendKeys(Excel_Data.readStringData("Sheet2", 1, 1));

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@BeforeMethod
	public void BeforeMethod() {
	}

	@AfterMethod
	public void AfterMethod() {
	}

	@AfterClass
	public void AfterClass() {
		driver.findElement(By.xpath("//a[@href='/customer/info']")).click();
		driver.findElement(By.partialLinkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
//		driver.quit();
	}

	@AfterTest
	public void AfterTest() {
	}

	@AfterSuite
	public void AfterSuite() {
	}
}