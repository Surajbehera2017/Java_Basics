package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_operations {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File f = new File("D:/Selenium/Mars_Wrkspace/Java_basic/src/com/ExcelOperations/Demo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		
		for(int i=0; i<=rownum; i++)
		{
			Row row= sheet.getRow(i);
			
			for(int j = 0; j<row.getLastCellNum(); j++)
			{
				System.out.println(i+"  ,"+j);
				System.out.println(getcell(i,j));
				
			}
			
		}
		

	}
	
	static String getcell(int r, int c) throws IOException, InvalidFormatException
	{
		File f = new File("D:/Selenium/Mars_Wrkspace/Java_basic/src/com/ExcelOperations/Demo.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(f);
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		
		
			
			
		Row row= sheet.getRow(r);
		CellType celltype = row.getCell(c).getCellTypeEnum();
		
		String cell=null;
		if(celltype==celltype.STRING)
			cell = row.getCell(c).getStringCellValue();
		
		else if(celltype==celltype.NUMERIC)
			cell = String.valueOf(row.getCell(c).getNumericCellValue());
		
		wbook.close();
		return cell;
		
	}

}
