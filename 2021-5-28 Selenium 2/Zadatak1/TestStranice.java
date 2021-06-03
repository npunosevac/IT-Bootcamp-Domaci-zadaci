package zadatak1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStranice {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testButton() {
		driver.navigate().to(PocetnaStranica.URL);
		PocetnaStranica.clickDonacije(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Donacije.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
}
