package com.app.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.testBase.TestBase;

public class ProductDetailPage extends TestBase{
	public ProductDetailPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@onclick='addToCart(1)']")
	private WebElement add_to_cart;
	
	public void clickOnAddToCartLink() {
		add_to_cart.click();
	}
}
