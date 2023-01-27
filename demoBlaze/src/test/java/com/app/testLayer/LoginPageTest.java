package com.app.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pageLayer.HomePage;
import com.app.pageLayer.LoginPage;
import com.app.testBase.TestBase;

public class LoginPageTest extends TestBase{
	@Test
public void vefiryLoginFunctionality() throws InterruptedException{
		String expt_output="Welcome ajr";
		home_page_obj.clickOnLoginButton();
		login_obj.sendUserName(read_excel_obj.readData("userpass", 1, 0));
		login_obj.sendPassWord(read_excel_obj.readData("userpass", 1, 1));
		login_obj.clickOnSinginButton();
		Thread.sleep(5000);
		String act_output=home_page_obj.verifyLoginMassage();
		System.out.println(act_output);
		Assert.assertEquals(act_output,expt_output);
	
		
}
}
