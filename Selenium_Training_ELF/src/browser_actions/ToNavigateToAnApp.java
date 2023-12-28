package browser_actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zomato.com");
		String WindowID = driver.getWindowHandle();
		System.out.println(WindowID);
	}
}