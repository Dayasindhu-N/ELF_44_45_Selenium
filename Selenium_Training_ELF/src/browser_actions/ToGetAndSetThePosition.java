package browser_actions;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAndSetThePosition {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com");
		
		Point position = driver.manage().window().getPosition();
		System.out.println("The Positionof X:"+position.getX());
		System.out.println("The Positionof y:"+position.getY());
		
		Thread.sleep(2000);
		Point targetPosition = new Point(0, 0);
		driver.manage().window().setPosition(targetPosition);
	}
}