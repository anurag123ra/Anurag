package com.app.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.testBase.TestBase;

public class PlaceOrderPage extends TestBase{
@FindBy(xpath="//input[@id='name']")
private WebElement name;
@FindBy(xpath="//input[@id='country']")
private WebElement country;
@FindBy(xpath="//input[@id='city']")
private WebElement city;
@FindBy(xpath="//input[@id='card']")
private WebElement credit_card;
@FindBy(xpath="//input[@id='month']")
private WebElement month;
@FindBy(xpath="//input[@id='year']")
private WebElement year;
@FindBy(xpath="//button[contains(text(),'Purchase')]")
private WebElement purchase_btn;
@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
private WebElement purchase_massage;
public PlaceOrderPage() {
	PageFactory.initElements(driver,this);
}
public void sendProductDetails() {
	name.sendKeys(read_excel_obj.readData("detail", 1, 0));
	country.sendKeys("belarus");
	city.sendKeys("budapest");
	credit_card.sendKeys("007");
	month.sendKeys("07");
	year.sendKeys("2023");
	purchase_btn.click();
}
public String verifyPurchase() {
	String massage=purchase_massage.getText();
	return massage;
}
}
