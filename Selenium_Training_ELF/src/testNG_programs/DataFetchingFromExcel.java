package testNG_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFetchingFromExcel {
	@DataProvider
	public String[][] passTestData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(new File("./resources/DataProvider.xlsx"));
		Workbook book = WorkbookFactory.create(fis);
		Sheet dataSheet = book.getSheet("Sheet2");
		int rowCount = dataSheet.getPhysicalNumberOfRows();
		int cellCount = dataSheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowCount][cellCount];
		for(int i=0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i][j] = dataSheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "passTestData")
	public void testingUsernameTextField(String[] data) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+data[0].toLowerCase()+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
		driver.findElement(By.id("register-button")).click();
	}
}