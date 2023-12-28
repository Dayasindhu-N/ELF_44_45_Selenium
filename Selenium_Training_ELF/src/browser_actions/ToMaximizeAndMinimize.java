package browser_actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeAndMinimize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
	}
}