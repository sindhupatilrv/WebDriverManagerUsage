package WebDriverManagerWebDriverManagerCom;

public class TestingWebDriverManager {

	public static void main(String[] args) {

		driverhelpers callchromeclass = new driverhelpers();
		driverhelpers calledgeclass = new driverhelpers();
		
		callchromeclass.chromedriverhelpers();
		callchromeclass.lunchWebPage();
		
		calledgeclass.edgedriverhelpers();
		calledgeclass.lunchWebPage();
		
		
		
	}
}
