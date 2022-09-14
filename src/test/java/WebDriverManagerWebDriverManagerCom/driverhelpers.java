package WebDriverManagerWebDriverManagerCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverhelpers {

	public WebDriver driver;
	
	public int chromedriverhelpers() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return 0;
	}

	public int edgedriverhelpers() {	
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return 0;
	} 
	
	public int firefoxdriverhelpers() {	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return 0;
	}
	
	/*public int operadriverhelpers() {	
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
		return 0;
	} */
	
	
	
	public void lunchWebPage() {
		driver.get("https://www.google.com");
		System.out.println("Page name:" + driver.getTitle());	
		driver.close();
		driver.quit();
		
	}
}
