package roboselenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest {
	
	@Test
	public void LaunchChrome_Method1() {
		
		String _path = "src/main/resources/libs/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", _path);

		// Set Chrome Headless mode as TRUE
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		// Instantiate Web Driver
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		System.out.println("Page title is - " + driver.getTitle());
		
		
		
	}

}
