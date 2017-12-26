package com.selenium.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.selenium.base.TestBase;
import com.selenium.utilities.TestUtil;

public class LoginTest extends TestBase{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void loginTest(String Email, String Password, String Runmode) throws IOException{
		
		if(!Runmode.equals("Y")){
			
			throw new SkipException("Skipping the test case as the run mode for data set is NO");
		}
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("signInlink_XPATH"))), "Sign in Link was not successfully clicked");
		verifyEquals("VendorsDepot","VendorsDepot");
		click("signInlink_XPATH");
		logs.info("Login Test is successfully Passed");
		click("signInasBuyerlink_XPATH");
		type("username_XPATH", Email);
		
		type("password_XPATH", Password);
		click("SignInButton_XPATH");
		/*
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(AlertText));
		alert.accept();*/
		
	//	Assert.fail();
		
		
	}

}
