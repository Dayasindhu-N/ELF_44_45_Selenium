package task_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePopUpsPostionsChanging {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dayas/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(4000);
		Set<String> allWindowId = driver.getWindowHandles();
		
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			Dimension Size = driver.manage().window().getSize();
			System.out.println("Height:"+Size.getHeight());
			System.out.println("Width:"+Size.getWidth());
			
			Thread.sleep(2000);
			Dimension newSize = new Dimension(473, 923);
			driver.manage().window().setSize(newSize);
			
			
			Point Position = driver.manage().window().getPosition();
			System.out.println("X value = "+Position.getX());
			System.out.println("Y value = "+Position.getY());
			
			Thread.sleep(2000);
			Point targetPosition = new Point(54, 35);
			driver.manage().window().setPosition(targetPosition);
			
			System.out.println(driver.getTitle());
		}
		//driver.quit();
	}
}