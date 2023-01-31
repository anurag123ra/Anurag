package com.app.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.app.testBase.TestBase;

public class Util extends TestBase{

	
	public void alertHandle() {
		driver.switchTo().alert().accept();
	}
	public static void screenShot(String filename) {
		 String path="E:\\eclipse 2022\\demoBlaze\\screenshot\\";
	  try {
		  TakesScreenshot a = ((TakesScreenshot)driver);
		  File src=a.getScreenshotAs(OutputType.FILE);
		  File dest=new File(path+filename+".png");
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		System.out.println("Enter Valid File Path");
		e.printStackTrace();
	}
		
	}
}
