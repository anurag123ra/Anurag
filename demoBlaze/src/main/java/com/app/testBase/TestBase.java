package com.app.testBase;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pageLayer.CartPage;
import com.app.pageLayer.HomePage;
import com.app.pageLayer.LoginPage;
import com.app.pageLayer.PlaceOrderPage;
import com.app.pageLayer.ProductDetailPage;
import com.app.utilities.ReadConfig;
import com.app.utilities.ReadExcel;
import com.app.utilities.Util;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {
	public static WebDriver driver;
	public static Logger logger;
	public HomePage home_page_obj;
	public LoginPage login_obj;
	public CartPage cart_obj;
	public ProductDetailPage product_page_obj;
	public Util util_obj;
	public PlaceOrderPage place_order_page_obj;
	public ReadConfig read_config;
	public ReadExcel read_excel_obj;
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("Demoblaze Automation Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework execution stopped");
	}
	
	@BeforeMethod
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demoblaze.com/");
		logger.info("Browser Launched");
		home_page_obj=new HomePage();
		login_obj=new LoginPage();
		cart_obj=new CartPage();
		product_page_obj=new ProductDetailPage();
		util_obj=new Util();
		place_order_page_obj=new PlaceOrderPage();
		read_excel_obj= new ReadExcel();
		logger.info("Object created");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("Browser Closed");
	}
}
