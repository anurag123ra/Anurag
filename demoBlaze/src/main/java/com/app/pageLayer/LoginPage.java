package com.app.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.testBase.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement user_name;
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement pass_word;
	@FindBy(xpath="//button[@onclick='logIn()']")
	private WebElement singin_btn;
public LoginPage() {
	PageFactory.initElements(driver,this);
}
public String sendUserName(String username) {
	user_name.sendKeys(username);
	return username;
}
public String sendPassWord(String password) {
	pass_word.sendKeys(password);
	return password;
}
public void clickOnSinginButton() {
	singin_btn.click();	
}
}
