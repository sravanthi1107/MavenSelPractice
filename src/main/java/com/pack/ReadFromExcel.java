package com.pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromExcel {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception, InvalidFormatException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\SRAVANTHI-PERSONAL\\MavenProjectSel-2020\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		FileInputStream fis=new FileInputStream("C:\\sel-bhanu-html\\QspiderEx.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("Sheet1");
		Row row=s1.getRow(0);
		System.out.println(s1);
		Cell cel=row.getCell(0);
		String v=cel.getStringCellValue();
		System.out.println(v);
		
		cel.setCellValue("bangalore");
		FileOutputStream fos=new FileOutputStream("C:\\\\sel-bhanu-html\\\\QspiderExWrite.xlsx");
		wb.write(fos);;
	}

}
