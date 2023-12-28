package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement usernameTextBox = driver.findElement(By.id("Email"));
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		
		Point emailBoxLoc = usernameTextBox.getLocation();
		Point passwordBoxLoc = passwordTextBox.getLocation();
		System.out.println("The value of X of email textbox:"+emailBoxLoc.getX());
		System.out.println("The value of X of password textbox:"+passwordBoxLoc.getX());
		
		if (emailBoxLoc.getX()==passwordBoxLoc.getX()) {
			System.out.println("Email textbox and Password textbox is aligned properly towards left");
		} else {
			System.out.println("Email textbox and Password textbox is not aligned properly towards left");
		}
		driver.quit();
	}
}