package zadatak1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestITBootcamp {
	
	/*Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
	Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
	U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
	Dokazati da prilikom koriscenja reci “testiranje” u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot stranice. 
	nakon pretrage - istraziti na netu kako.
	Pomocu testNG-ja proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu. */
	
	public static final String OPEN_SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	public static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itbootcamp.rs/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.getTitle();
		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		driver.navigate().refresh();
		driver.navigate().to("https://itbootcamp.rs/obaveze-polaznika/");
		driver.navigate().back();
		driver.navigate().forward();
				
		//driver.navigate().forward(); – to navigate to the next web page with reference to the browser’s history
		//driver.navigate().back(); – takes back to the previous web page with reference to the browser’s history
		//driver.navigate().refresh(); – to refresh the current web page thereby reloading all the web elements
		//driver.navigate().to(“url”); – to launch a new web browser window and navigate to the specified URL
		
		//Ovako saznajemo koje nam je velicine browser kada se program pokrene
		//ispisujemo na konzoli kako bi smo mogli da postavimo te iste dimenzije dole
		//i vratimo na prvobitnu velicinu
		
		/*Dimension point = driver.manage().window().getSize();
		System.out.println(point);*/
		//Da ne bi smo stavljali dimenzije, pravimo ovako
		Dimension windowsize = driver.manage().window().getSize();
		
		
		//maksimizujemo browser
		driver.manage().window().maximize();
		
		//fullscreen prozora
		//driver.manage().window().fullscreen();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		//vracamo na prvobitnu velicinu (width, height)
		//driver.manage().window().setSize(new Dimension(1051, 815));
		driver.manage().window().setSize(windowsize);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Search")).click();
		WebElement openSearch = driver.findElement(By.xpath(OPEN_SEARCH_XPATH));
		openSearch.click();
		
		//+ "\n" sluzi kao enter
		WebElement search = driver.findElement(By.xpath(SEARCH_XPATH));
		search.sendKeys("testiranje" + "\n");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\kiputebra\\Desktop\\Screenshot Test/testiranje.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
	}

}
