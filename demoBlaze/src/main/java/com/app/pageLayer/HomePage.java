package com.app.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.testBase.TestBase;

public class HomePage extends TestBase{
@FindBy(xpath="//a[@data-target='#logInModal']")
private WebElement login_btn;
@FindBy(xpath="")
private WebElement home_link;
@FindBy(xpath="//a[@id='cartur']")
private WebElement cart_link;
@FindBy(xpath="(//a[@class='hrefch'])[1]")
private WebElement samsung_mobile;
@FindBy(xpath="//a[@id='nameofuser']")
private WebElement status_msg;
public HomePage() {
	PageFactory.initElements(driver,this);	
}
public void clickOnHomeLink() {
	home_link.click();
}
public void clickOnCartLink() {
	cart_link.click();
}
public void clickOnSamsungMobile() {
	samsung_mobile.click();	
}
public void clickOnLoginButton() {
	login_btn.click();
}
public String verifyLoginMassage() {
	String masg=status_msg.getText();
	return masg;
}

}
