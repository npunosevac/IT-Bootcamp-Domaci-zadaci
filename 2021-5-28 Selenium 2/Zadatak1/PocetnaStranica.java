package zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PocetnaStranica {
	
	public static final String URL = "https://itbootcamp.rs/";
	
	public static void clickDonacije(WebDriver driver) {
		driver.findElement(By.linkText("DONACIJE")).click();
	}
}
