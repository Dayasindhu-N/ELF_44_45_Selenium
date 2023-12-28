package browser_actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageSource {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String Pagetitle = driver.getTitle();
		System.out.println("Title is:"+ Pagetitle);
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
	}
}