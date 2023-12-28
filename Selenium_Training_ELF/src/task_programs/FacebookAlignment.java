package task_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAlignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement usernameTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		
		Point emailBoxLoc = usernameTextBox.getLocation();
		Point passwordBoxLoc = passwordTextBox.getLocation();
		System.out.println("The value of X of email textbox:"+emailBoxLoc.getX());
		System.out.println("The value of Y of email textbox:"+emailBoxLoc.getY());
		System.out.println("The value of X of password textbox:"+passwordBoxLoc.getX());
		System.out.println("The value of Y of password textbox:"+passwordBoxLoc.getY());
		
		if (emailBoxLoc.getX()==passwordBoxLoc.getX()) {
			System.out.println("Email textbox and Password textbox is aligned properly towards left");
		} else {
			System.out.println("Email textbox and Password textbox is not aligned properly towards left");
		}
		driver.quit();
	}
}