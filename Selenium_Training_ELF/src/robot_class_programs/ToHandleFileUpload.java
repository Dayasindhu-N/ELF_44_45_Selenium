package robot_class_programs;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToHandleFileUpload {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.totaljobs.com/Account/Register");
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();
		driver.findElement(By.id("btnCVUpload")).click();
		driver.findElement(By.xpath("//label[text()='from this device']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("./AutoITScript/TotaljobsFileUpload.exe");
	}
}