package action_class_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("dayasindhu.n@testyantra.in");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele = driver.findElement(By.id("login-submit"));
		driver.findElement(By.name("password")).sendKeys("Dayanishu@29");
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		driver.findElement(By.xpath("//div[@title='ELF44']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Completed']"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(target).perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));
		for (WebElement eachElement : elements) {
			System.out.println(eachElement.getText());
		}
		
		driver.navigate().refresh();
		
		WebElement sourceFile = driver.findElement(By.linkText("Completed"));
		WebElement destFile = driver.findElement(By.xpath("//h2[text()='Automation Testing']/../../..//button[text()='Add a card']"));
		
		actions.dragAndDrop(sourceFile, destFile).perform();
		
		driver.quit();
	}
}