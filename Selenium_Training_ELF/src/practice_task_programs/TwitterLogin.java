package practice_task_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwitterLogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://twitter.com/i/flow/login");
		
		File sourcepath = new File("./resources/Book1.xlsx");
		FileInputStream fis = new FileInputStream(sourcepath);
		
		Workbook book1 = WorkbookFactory.create(fis);
		
		String email = book1.getSheet("Sheet1").getRow(0).getCell(1).toString();
		String phNo = book1.getSheet("Sheet1").getRow(1).getCell(2).toString();
		String password = book1.getSheet("Sheet1").getRow(2).getCell(1).toString();
		driver.findElement(By.name("text")).sendKeys(email);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.name("text")).sendKeys(phNo);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Reveal password']"));
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
		Thread.sleep(2000);
		action.release().click().perform();
	}
}

