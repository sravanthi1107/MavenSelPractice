package com.pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ContentofXl3Rows3Col {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C:\\\\\\\\sel-bhanu-html\\\\\\\\QspiderExWrite.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
        Sheet s1=wb.getSheet("Sheet1");
       
        
        for(int i=0;i<=2;i++)
        {
        	for(int j=0;j<=2;j++)
        	{
        		Row row=s1.getRow(i);
        		Cell cel=row.getCell(j);
        		String v=cel.toString();
        		System.out.println(v+"");
        		
        	}
        	System.out.println();
        }
        
		
		
		
		
		
	}

}
