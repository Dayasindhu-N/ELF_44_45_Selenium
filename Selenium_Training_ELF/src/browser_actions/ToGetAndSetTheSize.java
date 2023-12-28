package browser_actions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAndSetTheSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height is:"+size.getHeight());
		System.out.println("Width is:"+size.getWidth());
		
		Thread.sleep(2000);
		Dimension newSize = new Dimension(37, 45);
		driver.manage().window().setSize(newSize);
	}
}