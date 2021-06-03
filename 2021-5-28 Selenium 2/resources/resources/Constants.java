package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Constants {
	
	/* U zadatku sa casa, sve lokatore i druge konstante izmestiti u poseban paket
	 * pod nazivom resources u klasu Constants i shodno tome izmeniti ostatak koda */
	
	//public static final String URL = "http://demo.guru99.com/test/newtours/";
	//public static final String TXTUSERNAME_XPATH = "//*[@id=\"email\"]";
	
	public static final String URL = "http://demo.guru99.com/test/newtours/register.php";
	public static final String TXTUSERNAME_XPATH = "//*[@id=\"email\"]";
	public static final String PASSWORD = "input[name='password']";
	public static final String CONFIRM_PASSWORD = "input[name='confirmPassword']";
	public static final String SUBMIT = "input[name='submit']";
	
	public static final String NAME_VALUE = "Nikola";
	public static final String PASSWORD_VALUE = "123";
	public static final String CONFIRM_PASSWORD_VALUE = "123";
	
	public static void clickRegBtn(WebDriver driver) {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	public static void inputUsername(WebDriver driver, String username) {
		//pronasli smo element pomocu xPath-a i upisali vrednost - ime
		driver.findElement(By.xpath(Constants.TXTUSERNAME_XPATH)).sendKeys(Constants.NAME_VALUE);
	}
	
	//Izgleda da kada nam je lokator u metodi, tada nam ne treba gore konstanta final za taj lokator 
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.cssSelector(Constants.PASSWORD)).sendKeys(Constants.PASSWORD_VALUE);
	}
	
	public static void inputConfirmPassword(WebDriver driver, String confirmPassword) {
		driver.findElement(By.cssSelector(Constants.CONFIRM_PASSWORD)).sendKeys(Constants.CONFIRM_PASSWORD_VALUE);
	}
	
	public static void submit(WebDriver driver) {
		driver.findElement(By.cssSelector(Constants.SUBMIT)).click();
	}

}
