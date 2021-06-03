package seleniumUvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageClickLinks {
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String BUSINESS_LINK_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]";
	public static final String SALON_LINK_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[2]";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		//otvara page 404 not found
		WebElement businessLink = driver.findElement(By.xpath(BUSINESS_LINK_XPATH));
		businessLink.click();
		
		driver.navigate().back();
		
		//otvara sajt www.tripadvisor.in
		WebElement salonLink = driver.findElement(By.xpath(SALON_LINK_XPATH));
		salonLink.click();
		
		driver.navigate().back();
		
		//driver.close();
		
	}

}
