package task_programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataAndStoringInExternalFile {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Resource\\Sample.html");
		if (!file.exists()) {
			System.out.println("File is created");
			file.createNewFile();
		} else {
			System.out.println("File already exist");
		}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dayas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tatamotors.com");
		
		FileOutputStream fos = new FileOutputStream(file);
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		fos.write(PageSource.getBytes());
		fos.write('\n');
		fos.close();
		
		driver.quit();
	}
}