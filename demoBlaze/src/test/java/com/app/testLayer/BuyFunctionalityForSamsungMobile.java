package com.app.testLayer;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.app.testBase.TestBase;

public class BuyFunctionalityForSamsungMobile extends TestBase{
@Test
public void verifyBuyFunctionalityForSamsungMobile() throws InterruptedException {
	String exp_massage="Thank you for your purchase!";
	home_page_obj.clickOnLoginButton();
	login_obj.sendUserName(read_excel_obj.readData("userpass", 1, 0));
	login_obj.sendPassWord(read_excel_obj.readData("userpass", 1, 1));
	login_obj.clickOnSinginButton();
	logger.info("Logged In");
	Thread.sleep(2000);
	home_page_obj.clickOnSamsungMobile();
	product_page_obj.clickOnAddToCartLink();
	logger.info("Product Added To Cart");
	Thread.sleep(2000);
	util_obj.alertHandle();
	home_page_obj.clickOnCartLink();
	cart_obj.clickOnPlaceOrderButton();
    place_order_page_obj.sendProductDetails();
   String act_massage= place_order_page_obj.verifyPurchase();
   logger.info("Order Placed Succesfully");
    Assert.assertEquals(exp_massage,act_massage);
}
}
