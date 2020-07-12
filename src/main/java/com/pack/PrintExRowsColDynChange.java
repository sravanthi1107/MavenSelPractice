package com.pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class PrintExRowsColDynChange {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis=new FileInputStream("C:\\sel-bhanu-html\\DynamicData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s1=wb.getSheet("Sheet1");
		int rc=s1.getLastRowNum();
		System.out.println(rc);
		int cc=s1.getRow(0).getLastCellNum();
		System.out.println(cc);
		
		for(int i=0;i<=rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				Row r=s1.getRow(i);
				Cell cel=r.getCell(j);
				String v=cel.toString();
				System.out.println(v);
				
			}
		}
		
		
			

	}

}
