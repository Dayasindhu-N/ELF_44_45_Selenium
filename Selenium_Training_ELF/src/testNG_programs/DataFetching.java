package testNG_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFetching {
	@DataProvider
	public String[] passTestData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./resources/DataProvider.xlsx"));
		Workbook book = WorkbookFactory.create(fis);
		int cellCount = book.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells()-1;
		String[] data = new String[cellCount];
		for(int i=0;i<cellCount;i++) {
			data[i] = book.getSheet("Sheet1").getRow(0).getCell(i+1).toString();
		}
		return data;
	}
	
	@Test(dataProvider = "passTestData")
	public void testingUsernameTextField(String data) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(data);
		
//		driver.findElement(By.id("Password")).sendKeys(data2);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}