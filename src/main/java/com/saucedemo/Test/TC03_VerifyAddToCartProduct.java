package com.saucedemo.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POM.InventoryPOM;
import com.saucedemo.Utility.UtilityClass;

public class TC03_VerifyAddToCartProduct extends TestBase {

	@Test
	public void VerifyAddToCartProduct() throws IOException {
		
		log.info("Went To Homepage");
	    UtilityClass.screenshotMethod(driver, "TC03_InventoryPage");
	   
	    InventoryPOM ip=new InventoryPOM(driver);
	    ip.clickBackpackAddToCartBtn();
	    UtilityClass.screenshotMethod(driver, "TC03_ClickOnAddTOCart");
	    
	    String actcart="1";
	   String cart=ip.getTextFromCartBadge();
	    
	    Assert.assertEquals(actcart, cart);
	   
	}
	
}
