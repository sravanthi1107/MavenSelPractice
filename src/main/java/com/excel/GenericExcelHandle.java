package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

public class GenericExcelHandle {
	
	public static int getRowCount(String path, String sheet)
	{
		 int rc=0;
		 try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			rc=wb.getSheet(sheet).getLastRowNum();
			}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 	 
		return rc;
		 
	}
	
	public static String getCellvalue( String path,String sheet,int r,int c)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return v;
		
	}

	

}
