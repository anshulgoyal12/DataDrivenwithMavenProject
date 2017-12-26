package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.selenium.base.TestBase;
import com.selenium.utilities.TestUtil;



public class ProfileTest extends TestBase{
	
	@Test
	public void profileTest() throws InterruptedException{
		
		if(!TestUtil.isExecutables("ProfileTest")){
			
			throw new SkipException("Skipping the test "+"ProfileTest".toUpperCase()+"as the run mode is No");
		}
		
		WebElement element = driver.findElement(By.xpath(OR.getProperty("MyAccount_XPATH")));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		click("Profilelink_XPATH");
		click("EditProfileButton_XPATH");
		click("StateDropdown_XPATH");
		type("StateDropdown_XPATH","AZ");
		Thread.sleep(5000);

		

	}
	
	

}
