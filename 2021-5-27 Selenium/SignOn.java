package seleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOn {
	
	/* Testiranje sajta http://demo.guru99.com/test/newtours/
	Koristiti razlicite moguce lokatore za pronalazenje elemenata - isprobati vise nacina;
	Zapamtiti lokacije u konstantama */
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String SIGN_ON_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
	public static final String USERNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input";
	public static final String PASSWORD_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	public static final String SUBMIT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input";
	public static final String SIGN_OFF_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		WebElement signOn = driver.findElement(By.xpath(SIGN_ON_XPATH));
		signOn.click();
		
		WebElement userName = driver.findElement(By.xpath(USERNAME_XPATH));
		userName.sendKeys("pera");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("pera123!");
		
		WebElement submit = driver.findElement(By.xpath(SUBMIT_XPATH));
		submit.click();
		
		WebElement signOff = driver.findElement(By.xpath(SIGN_OFF_XPATH));
		signOff.click();
		
		//driver.close();
	}

}
