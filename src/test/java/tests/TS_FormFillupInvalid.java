package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import functionalities.FormFillingFunctionality;

public class TS_FormFillupInvalid extends BaseClass {
	
	BaseClass bc= new BaseClass();
	
		FormFillingFunctionality fill = new FormFillingFunctionality();
		
	
	@Test(priority=1)
	public void TC_InvalidEmail() {
		fill.getCourse();
		fill.navigateForm();
		fill.setFormValues(1);
	}
	@Test(priority=2)
	public void TC_noData1() {
		refresh();
		fill.setFormValues(4);
		String alert=driver.findElement(By.id("ValidMsgCoronavirus_No_of_Learners__c")).getText();
		Assert.assertEquals(alert,"Maximum number of learners can not exceed 20,000");
	}
	@Test(priority=3)
	public void TC_wrongData() {
		refresh();
		fill.setFormValues(5);
		//String alert=driver.findElement(By.id("ValidMsgPhone")).getText();
		//Assert.assertEquals(alert,"Must be a phone number. 503-555-1212");
	}
	@Test(priority=4)
	public void TC_noData2() {
		refresh();
		fill.setFormValues(6);
		String alert=driver.findElement(By.className("mktoError")).getText();
		Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=5)
	public void TC_noData3() {
		refresh();
		fill.setFormValues(7);
		String alert=driver.findElement(By.className("mktoError")).getText();
		Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=6)
	public void TC_noData4() {
		refresh();
		fill.setFormValues(8);
		String alert=driver.findElement(By.className("mktoError")).getText();
		Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=7)
	public void TC_noData5() {
		refresh();
		fill.setFormValues(9);
		//String alert=driver.findElement(By.className("mktoError")).getText();
		//Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=8)
	public void TC_noData6() {
		refresh();
		fill.setFormValues(10);
		String alert=driver.findElement(By.className("mktoError")).getText();
		Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=9)
	public void TC_noData7() {
		refresh();
		fill.setFormValues(11);
		//String alert=driver.findElement(By.className("mktoError")).getText();
		//Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=10)
	public void TC_noData8() {
		refresh();
		fill.setFormValues(12);
		//String alert=driver.findElement(By.className("mktoError")).getText();
		//Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=11)
	public void TC_noData9() {
		refresh();
		fill.setFormValues(13);
		//String alert=driver.findElement(By.className("mktoError")).getText();
		//Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=12)
	public void TC_noData10() {
		refresh();
		fill.setFormValues(14);
		//String alert=driver.findElement(By.className("mktoError")).getText();
		//Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=13)
	public void TC_noData11() {
		refresh();
		fill.setFormValues(14);
		//String alert=driver.findElement(By.id("ValidMsgC4C_Job_Title__c")).getText();
		//Assert.assertEquals(alert,"This field is required.");
	}
	@Test(priority=14)
	public void TC_noData12() {
		
		refresh();
		fill.setFormValues(15);
		//String alert=driver.findElement(By.id("ValidMsgEmail")).getText();
		//Assert.assertEquals(alert,"Must be valid email. example@yourdomain.com.");
	}
	@Test(priority=15)
	public void TC_noData13() {
		refresh();
		fill.setFormValues(16);
		//String alert=driver.findElement(By.id("ValidMsgEmail")).getText();
		//Assert.assertEquals(alert,"Must be valid email. example@yourdomain.com.");
	}
	@Test(priority=16)
	public void TC_click1() {
		refresh();
		driver.findElement(By.xpath(config.getProperty("T&C"))).click();
	}

}