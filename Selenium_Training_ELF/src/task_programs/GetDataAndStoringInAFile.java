package task_programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataAndStoringInAFile {

	public static void main(String[] args) throws IOException {
		File file = new File("Sample.txt12");
		if (!file.exists()) {
			System.out.println("File is created");
			file.createNewFile();
		} else {
			System.out.println("File is already created");
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ashokleyland.com");
		
		FileOutputStream fos = new FileOutputStream(file);
		String PageTitle = driver.getTitle();
		String PageURL = driver.getCurrentUrl();
		System.out.println(PageTitle);
		System.out.println(PageURL);
		fos.write(PageTitle.getBytes());
		fos.write('\n');
		fos.write(PageURL.getBytes());
		fos.close();
		
		driver.quit();
	}
}