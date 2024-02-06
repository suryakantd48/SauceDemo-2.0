package com.saucedemo.Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.Utility.UtilityClass;

public class TC02_VerifyLoginWithInvalidCredentials extends TestBase {
	
	@Test
	public void VerifyLoginWithInValidCredentials() throws IOException {
	   
	   	UtilityClass.screenshotMethod(driver, "TC02_ERRORMsg");
	    
	   	log.info("Applying Verification");
	    
	    WebElement errormsg=driver.findElement(By.xpath("//h3[contains(text() ,'Epic sadface:')]"));
	    boolean result = errormsg.isDisplayed();
	     
	    Assert.assertTrue(result);
	  
	}
	
}
