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

/***
 * 
 * @author Daya 
 * Date - 12/12/2023
 * 
 */

public class Twitter_TC_001 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// Steps to read data from Excel
		Workbook book1 = WorkbookFactory.create(new FileInputStream(new File("./resources/Book1.xlsx")));

		String email = book1.getSheet("Sheet1").getRow(0).getCell(1).toString();
		String phNo = book1.getSheet("Sheet1").getRow(1).getCell(2).toString();
		String password = book1.getSheet("Sheet1").getRow(2).getCell(1).toString();

		// Expected Data
		String welcomePageTitle = "X";
		
		// Test Step1: Open the page and enter url.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://twitter.com/i/flow/login");
		String actualWebPageTitle = driver.getTitle();
		System.out.println(actualWebPageTitle);
		if (actualWebPageTitle.equals(welcomePageTitle)) {
			System.out.println("Welcome page is displayed");
		} else {
			System.out.println("Welcome pages is not displayed");
		}
		
		//Test Step2: Enter the username and click on the next button.
		WebElement emailTextField = driver.findElement(By.name("text"));
		emailTextField.clear();
		emailTextField.sendKeys(email);
		String usernameEntered = emailTextField.getAttribute("value");
		if (usernameEntered.equals(email)) {
			System.out.println("Username was entered sucessfully");
		} else {
			System.out.println("Username was not entered sucessfully");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//Test Step3: Enter the phone number and click on the next button.
		WebElement phNoTextField = driver.findElement(By.name("text"));
		phNoTextField.clear();
		phNoTextField.sendKeys(phNo);
		String phNoEntered = phNoTextField.getAttribute("value");
		if (phNoEntered.equals(phNo)) {
			System.out.println("Phone Number was entered sucessfully");
		} else {
			System.out.println("Phone Number was not entered sucessfully");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//Test Step4: Enter the password.
		WebElement pwdTextField = driver.findElement(By.name("password"));
		pwdTextField.clear();
		pwdTextField.sendKeys(password);
		String pwdEntered = pwdTextField.getAttribute("value");
		if (pwdEntered.equals(password)) {
			System.out.println("Password was entered sucessfully");
		} else {
			System.out.println("Password was not entered sucessfully");
		}
		
		//Test Step5: Click on the next button.
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		button.click();
	}
}
