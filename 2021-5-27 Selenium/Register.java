package seleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	
	/* Testiranje sajta http://demo.guru99.com/test/newtours/
	Koristiti razlicite moguce lokatore za pronalazenje elemenata - isprobati vise nacina;
	Zapamtiti lokacije u konstantama */
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String REGISTER_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	
	//Contact Information
	public static final String TXTNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	public static final String TXTLASTNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input";
	public static final String NUMPHONE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input";
	public static final String TXTEMAIL_XPATH = "//*[@id=\"userName\"]";
	
	//Mailing Information
	public static final String TXTADDRESS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input";
	public static final String TXTCITY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input";
	public static final String TXTSTATE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input";
	public static final String TXTPOSTALCODE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input";
	public static final String TXTCOUNTRY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select";
	
	//User Information	
	public static final String TXTUSERNAME_XPATH = "//*[@id=\"email\"]";
	public static final String TXTPASS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
	public static final String TXTCONFIRMPASS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input";
	
	public static final String BUTTON_SUBMIT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input";
	
	public static final String SIGNOFF_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		WebElement register = driver.findElement(By.xpath(REGISTER_XPATH));
		register.click();
		
		//Contact Information na tri nacina, xPath, By.name i css selector
		WebElement firstName = driver.findElement(By.xpath(TXTNAME_XPATH));
		firstName.sendKeys("Petar");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Petrovic");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("00 381 64666555");
		
		WebElement email = driver.findElement(By.cssSelector("#userName"));
		email.sendKeys("petarpetrovic@yahoo.com");
		
		
		//Mailing Information na dva nacina, xPath i By.name
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Kneza Milosa 21");
		
		WebElement city = driver.findElement(By.xpath(TXTCITY_XPATH));
		city.sendKeys("Beograd");
		
		WebElement state = driver.findElement(By.xpath(TXTSTATE_XPATH));
		state.sendKeys("Stari grad");
		
		WebElement postalCode = driver.findElement(By.xpath(TXTPOSTALCODE_XPATH));
		postalCode.sendKeys("11000");
				
		WebElement country = driver.findElement(By.name("country"));
		country.sendKeys("SERBIA");
		
		//User Information na dva nacina by.id i xPath
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("pera");
		
		WebElement pass = driver.findElement(By.xpath(TXTPASS_XPATH));		
		pass.sendKeys("pera123!");
		
		WebElement confirmPass = driver.findElement(By.xpath(TXTCONFIRMPASS_XPATH));
		confirmPass.sendKeys("pera123!");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		WebElement signOff = driver.findElement(By.xpath(SIGNOFF_XPATH));
		signOff.click();
		
		driver.close();
		
	}

}
