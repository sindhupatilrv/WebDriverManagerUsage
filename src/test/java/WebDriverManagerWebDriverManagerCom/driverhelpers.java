package WebDriverManagerWebDriverManagerCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverhelpers {

	public int chromedriverhelpers() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.getTitle();	
		driver.close();
		driver.quit();
		return 0;
	}

	public int Firforxdriverhelpers() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new 	EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());	
		driver.close();
		driver.quit();
		return 0;
	} 
}
