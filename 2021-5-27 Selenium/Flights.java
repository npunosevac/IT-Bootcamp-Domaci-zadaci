package seleniumUvod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String FLIGHTS_XPATH = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
	
	//Flight Details
	public static final String TRIPTYPE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
	public static final String PASSENGERS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select";
	public static final String DEPARTINGFROM_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select";
	public static final String ONMONTH_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]";
	public static final String ONDAY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]";
	public static final String ARRIVINGIN_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select";
	public static final String RETURNING_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]";
	public static final String RETURNING_DAY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]";
	
	//Preferences
	public static final String SERVICE_CLASS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
	public static final String AIRLINE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select";
	
	//Find flights
	public static final String CONTINUE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input";
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		WebElement flights = driver.findElement(By.xpath(FLIGHTS_XPATH));
		flights.click();
		
		WebElement oneWay = driver.findElement(By.xpath(TRIPTYPE_XPATH));
		oneWay.click();
		
		WebElement passengers = driver.findElement(By.xpath(PASSENGERS_XPATH));
		passengers.sendKeys("2");
		
		WebElement departing = driver.findElement(By.xpath(DEPARTINGFROM_XPATH));
		departing.sendKeys("Paris");
		
		WebElement onMonth = driver.findElement(By.xpath(ONMONTH_XPATH));
		onMonth.sendKeys("May");
		
		WebElement onDay = driver.findElement(By.xpath(ONDAY_XPATH));
		onDay.sendKeys("20");
		
		WebElement arriving = driver.findElement(By.xpath(ARRIVINGIN_XPATH));
		arriving.sendKeys("Seattle");
		
		WebElement returning = driver.findElement(By.xpath(RETURNING_XPATH));
		returning.sendKeys("September");
		
		WebElement returningDay = driver.findElement(By.xpath(RETURNING_DAY_XPATH));
		returningDay.sendKeys("5");
		
		//First class
		WebElement serviceClass = driver.findElement(By.xpath(SERVICE_CLASS_XPATH));
		serviceClass.click();
		
		WebElement airline = driver.findElement(By.xpath(AIRLINE_XPATH));
		airline.sendKeys("No Preference");
		
		//driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		WebElement findFlight = driver.findElement(By.xpath(CONTINUE_XPATH));
		findFlight.click();
		
		driver.quit();
	}

}
