package com.saucedemo.Test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POM.InventoryPOM;
import com.saucedemo.Utility.UtilityClass;

public class TC04_VerifyAddToCartByAllProducts extends TestBase {

	@Test
	public void VerifyAddToCartByAllProducts() throws IOException {
		
		log.info("Went To Homepage");
	    UtilityClass.screenshotMethod(driver, "TC04_InventoryPage");
	    
	    InventoryPOM ip=new InventoryPOM(driver);
	    
	    ip.clickOnAllProducts();
	    log.info("clicked On All Products");
	    UtilityClass.screenshotMethod(driver, "TC04_ClickOnAllProducts");
	    
	    String actcart="6";
		String cart=ip.getTextFromCartBadge();
		    
		Assert.assertEquals(actcart, cart);
	
	}
	
}
