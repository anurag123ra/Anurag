package com.app.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.testBase.TestBase;

public class CartPage extends TestBase{
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement place_order_btn;
public CartPage() {
	PageFactory.initElements(driver,this);	
}
public void clickOnPlaceOrderButton() {
	place_order_btn.click();
}
}
