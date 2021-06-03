package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.Constants;

public class RegistrationTest {
	
	//Kada koristim TestNG ne treba mi Main, mogu samo da pokrenem klasu RegistrationTest
	
	//moze biti i public
	private static WebDriver driver;
	
	//ovo se izvrsava pre svih funkcija
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testRegBtn() {
		driver.navigate().to(Constants.URL);
		Constants.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test
	public void testFormReg() {
		driver.navigate().to(Constants.URL);
		Constants.inputUsername(driver, "Nikola");
		Constants.inputPassword(driver, "123");
		Constants.inputConfirmPassword(driver, "123");
		Constants.submit(driver);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
}
