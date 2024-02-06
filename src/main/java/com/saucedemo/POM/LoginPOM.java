package com.saucedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver;
	private Actions act;
	
	@FindBy(id="user-name")private WebElement username;
	
	public void sendUsername() {
		username.sendKeys("standard_user");
	}
	
	public void sendInvalidUsername() {
		username.sendKeys("locked_out_user");
	}
	
	@FindBy(id="password") private WebElement password;
	
	public void sendPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void sendInvalidPassword() {
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(id="login-button")private WebElement loginbtn;
	
	public void clickLoginBtn() {
		loginbtn.click();
	}
	
	public void clickLoginBtnByMouseClick() {
		
		act.click(loginbtn).perform();
	}
	
	public LoginPOM(WebDriver driver) {
		this.driver= driver;
		act= new Actions(driver);
		PageFactory.initElements(driver, this);
	}

}
