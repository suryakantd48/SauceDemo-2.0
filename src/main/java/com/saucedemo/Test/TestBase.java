package com.saucedemo.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POM.LoginPOM;
import com.saucedemo.Utility.UtilityClass;

public class TestBase {
WebDriver driver;
Logger log= Logger.getLogger("Sauce-Demo");
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else {
			driver= new EdgeDriver();
			
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser is Opened");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		log.info("URL is Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		UtilityClass.screenshotMethod(driver, "TC01_Login Page");
		
		LoginPOM lp=new LoginPOM(driver);
		lp.sendUsername();
		log.info("Username is Entered");
		lp.sendPassword();
		log.info("Password is Entered");
		UtilityClass.screenshotMethod(driver, "TC01_Entered_Credentials");
		
		lp.clickLoginBtn();
		log.info("Clicked On Login Button");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("End Of program");
	}

}
