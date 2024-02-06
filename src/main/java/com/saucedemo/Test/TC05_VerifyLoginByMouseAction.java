package com.saucedemo.Test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.Utility.UtilityClass;

public class TC05_VerifyLoginByMouseAction extends TestBase {
	
	@Test
	public void VerifyLoginByMouseAction() throws IOException {
		
		
		log.info("Went To Home Page");
		UtilityClass.screenshotMethod(driver, "TC05_InventoryPage");
		log.info("Applying Verification");
	    String acturl=driver.getCurrentUrl();
	    String expurl="https://www.saucedemo.com/inventory.html";
	    Assert.assertEquals(acturl, expurl);
	}
	
}
