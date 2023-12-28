package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*to capture tool tip text*/
//		driver.get("https://www.woodenstreet.com/");
//		Thread.sleep(2000);
//		String ToolTipText = driver.findElement(By.cssSelector("img[title='Wooden TV Unit']")).getAttribute("title");
//		System.out.println(ToolTipText);
		
//		/*to capture the alternative text*/
//		driver.get("https://www.kalkifashion.com/");
//		Thread.sleep(2000);
//		String alternativeText = driver.findElement(By.cssSelector("img[title='Wedding Suits']")).getAttribute("alt");
//		System.out.println(alternativeText);
		
		/*to capture the data entered*/
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		searchbox.clear();
		searchbox.sendKeys("Party wears");
		String valueEntered = searchbox.getAttribute("value");
		System.out.println(valueEntered);
		driver.quit();
	}
}