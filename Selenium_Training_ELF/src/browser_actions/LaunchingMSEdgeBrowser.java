package browser_actions;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingMSEdgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dayas\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.quit();
	}
}