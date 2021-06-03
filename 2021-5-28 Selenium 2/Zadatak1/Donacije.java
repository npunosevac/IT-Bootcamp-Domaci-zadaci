package zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Donacije {
	
	public static final String URL = "https://itbootcamp.rs/donacije/";
	
	public static void submit(WebDriver driver) {
		driver.findElement(By.name("DONACIJE")).click();
	}
}
