package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utilities.BaseUi;

public class TS_BrowserCompatbility extends BaseUi {
	
	public static WebDriver Testdriver;
	
	//@BeforeSuite
	//@Test(priority=1)
	public void BrowserTestChrome() {
		Testdriver=getDriver("chrome");	
	openUrl();
	//driver.close();
	quitBrowser();
	}
	
	//@BeforeSuite
	//@Test(priority=2)
	public void BrowserTestFirefox() {
		
		Testdriver=getDriver("firefox");	
		openUrl();
		//driver.close();
		quitBrowser();
	}


}
