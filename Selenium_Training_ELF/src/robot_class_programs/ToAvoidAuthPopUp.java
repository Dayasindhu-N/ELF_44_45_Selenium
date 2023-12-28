package robot_class_programs;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToAvoidAuthPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://daya:daya@the-internet.herokuapp.com/basic_auth");
	}
}