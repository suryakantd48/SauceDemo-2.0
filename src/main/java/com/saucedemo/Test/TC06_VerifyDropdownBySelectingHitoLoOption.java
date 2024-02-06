package com.saucedemo.Test;

import java.io.IOException;
import org.testng.annotations.Test;

import com.saucedemo.POM.InventoryPOM;
import com.saucedemo.Utility.UtilityClass;

public class TC06_VerifyDropdownBySelectingHitoLoOption extends TestBase {

	@Test
	public void VerifyDropdownBySelectingHitoLoOption() throws IOException {
		
		log.info("Went To HomePage");
		UtilityClass.screenshotMethod(driver, "TC06_InventoryPage");
		
		InventoryPOM ip=new InventoryPOM(driver);
		ip.clickOnProductSortDropdowntoHiLo();
		log.info("clicked on DropDown");
		UtilityClass.screenshotMethod(driver, "TC05_ClickOnDropdown");
		log.info("Hi to Low Option Selected");
	
	}
	
}
