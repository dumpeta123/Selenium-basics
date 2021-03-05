package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.get("http://demo.guru99.com/test/newtours/register.php");

		// 1.xpath:

		/*
		 * driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F"
		 * ); System.out.println(driver.getTitle());
		 * driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rajendar")
		 * ;
		 * driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Dumpeta");
		 * driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(
		 * "rajendar.dumpeta@gmail.com");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Dumpeta143@");
		 * driver.findElement(By.xpath("//input[@id='checkbox']")).click();
		 */

		// 2.name :

		/*
		 * driver.findElement(By.name("firstName")).sendKeys("Rajendar");
		 * driver.findElement(By.name("lastName")).sendKeys("Dumpeta");
		 * driver.findElement(By.name("phone")).sendKeys("8179890798");
		 */

		// 3. LinkText:

		// driver.findElement(By.linkText("SIGN-ON")).click();

		// 4. PartialLinkText:

		// driver.findElement(By.partialLinkText("Payment Gateway")).click();

//		driver.quit();

	}

}
