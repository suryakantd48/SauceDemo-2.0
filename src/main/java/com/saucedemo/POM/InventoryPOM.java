package com.saucedemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPOM {
	private WebDriver driver;
	private Select s;

	@FindBy(id="add-to-cart-sauce-labs-backpack")private WebElement backpackaddtocartbtn;
	public void clickBackpackAddToCartBtn(){
		backpackaddtocartbtn.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement shoppingCartBadge;
		
	public void clickShoppingCartBadge() {
		shoppingCartBadge.click();
	}
		@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartbadge;
		
		public String getTextFromCartBadge() {
			String cart=cartbadge.getText();
			return cart;
		}
		
		@FindBy(xpath="//button[text()='Add to cart']")private List<WebElement> actAllProducts;
		
		public void clickOnAllProducts() {
			for(WebElement product:actAllProducts) {
				product.click();			}
		}
		
		@FindBy(xpath="//select[@class='product_sort_container']")private WebElement productSortDropdown;
		public void clickOnProductSortDropdowntoHiLo() {
			productSortDropdown.click();
			s.selectByValue("hilo");
		}
	
		public InventoryPOM(WebDriver driver) {
			this.driver=driver;
		    PageFactory.initElements(driver, this);
			s= new Select(productSortDropdown);
		}

}
