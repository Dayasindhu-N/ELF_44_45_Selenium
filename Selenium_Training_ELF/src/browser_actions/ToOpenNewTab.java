package browser_actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hersheyland.com");
		Thread.sleep(2000);
	}
}