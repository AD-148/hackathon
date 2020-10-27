package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.BaseUi;

public class BaseClass extends BaseUi{
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openWebsite()
	{
		driver = getDriver("firefox");
		openUrl();	
	}
	
	
	
	@AfterClass
	public void exitBrowser()
	{
		quitBrowser();
	}

}
