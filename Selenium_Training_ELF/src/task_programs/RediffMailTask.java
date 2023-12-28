package task_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffMailTask {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.partialLinkText("Write mail")).click();
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Dayasindhu.N");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//body[@spellcheck='true']")).sendKeys("Good Evining All");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		WebElement sucessMsg = driver.findElement(By.xpath("//div[text()='Your mail has been sent']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(sucessMsg));
		
		File source = driver.findElement(By.xpath("//div[text()='Your mail has been sent']")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/SuccessMessage.jpeg");
		FileHandler.copy(source, destFile);
		
		driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
		
		driver.findElement(By.xpath("//cite[@class='rd_mail_sel_all']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']/../span[@class='rd_fil_del']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		
		WebElement errorMsg = driver.findElement(By.xpath("//div[text()='15 mail(s) deleted successfully']"));
		wait.until(ExpectedConditions.visibilityOf(errorMsg));
		
		File source1 = driver.findElement(By.xpath("//div[text()='15 mail(s) deleted successfully']")).getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./Screenshot/ErrorMessage.jpeg");
		FileHandler.copy(source1, destFile1);
		
		driver.quit();
	}
}