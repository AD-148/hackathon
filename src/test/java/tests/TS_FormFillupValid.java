package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import functionalities.FormFillingFunctionality;

public class TS_FormFillupValid extends BaseClass {
	
	public FormFillingFunctionality fill;

	@BeforeTest
	public void TC_initiateCourse() {
		fill = new FormFillingFunctionality();
	}
	
	@Test(priority=1)
	public void TC_validData() {
		fill.getCourse();
		fill.navigateForm();
		fill.setFormValues(2);
	}
	
}
