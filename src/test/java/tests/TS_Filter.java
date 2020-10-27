package tests;

//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import functionalities.courseDetailsFunctionality;
import functionalities.filterFunctionality;

public class TS_Filter extends BaseClass{
	
	public filterFunctionality filter;
	public courseDetailsFunctionality details;

	@BeforeTest
	public void TC_initiateClasses()
	{
		filter = new filterFunctionality();
		details = new courseDetailsFunctionality();
	}
	@Test(priority=1)
	public void languagesDisplayed()
	{
		
		details.search("Language Learning");
		details.searchClick();
		filter.setLanguage();
	}
	@Test(priority=2)
	public void extractLanguageDetails()
	{
		filter.extractLanguageDetails();
	}
	@Test(priority=3)
	public void levelsDisplayed()
	{
		filter.setLevels();
	}
	@Test(priority=4)
	public void extractLevelsDetails()
	{
		filter.extractLevelDetails();
	}
	

}