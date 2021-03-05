package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendar\\chromedriver.exe");
		// System.setProperty("webddriver.gecho.driver",
		// "C:\\Users\\Rajendar\\geckodriver");

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.relgo.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(":: Relgo Networks | Automate your Business Processes, Cloud-Based Services ::")) {
			System.out.println("Currect Title");
		} else {
			System.out.println("In-Currect Title");
		}

		driver.quit();

	}
}
