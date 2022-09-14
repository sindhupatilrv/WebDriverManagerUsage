package WebDriverManagerWebDriverManagerCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Avoiding the chrome driver method 

/* Advandtage of usinng Webdriver Manager 
 *  and exception type -  illegalStateException. 
 *  We need to set exact path for driver executable/s else we get
 */
public class WebdriverCreateInst 
{
    	public static void main (String[] args) {
    		ChromeOptions option = new ChromeOptions();
    		//option.start-maximized();
    		
    		WebDriver driver = WebDriverManager.chromedriver().capabilities(option).create();
    		driver.get("https://www.google.com");
    		System.out.println(driver.getTitle());
    		driver.close();
    		
    	}
  

}
