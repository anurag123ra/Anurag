package com.app.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.app.testBase.TestBase;

public class ReadExcel {
private String path="E:\\eclipse 2022\\demoBlaze\\testdata\\data1.xlsx";
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public String readData(String sheet_name,int row_num,int cell_num) {
		
			
			try {
				fis =new FileInputStream(path);
				wb=new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sheet=wb.getSheet(sheet_name);
			
			
			DataFormatter format=new DataFormatter();
			String data=format.formatCellValue(sheet.getRow(row_num).getCell(cell_num));
	        return data;
		
		}
		
	
}
