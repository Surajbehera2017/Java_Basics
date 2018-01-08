package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		Practice pract = new Practice();
		//pract.readAllValues("D:/Test.xlsx",0);
		//pract.ExcelOperation("D:/Test.xlsx");
		
		FirefoxBinary Fbin = new FirefoxBinary(new File(""));
		FirefoxProfile fprof = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(Fbin,fprof);
		
		//select
		Select sel = new Select(driver.findElement(By.id("")));
		sel.selectByIndex(1);
		sel.selectByValue("");
		sel.selectByVisibleText("");
		
		
		//Alert
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys("");
		
		al.authenticateUsing(new UserAndPassword("", "") );
		
		//Frame
		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		driver.switchTo().defaultContent();
		
		
		//Windows
		String parentwin = driver.getWindowHandle();
		Set<String> Windows = driver.getWindowHandles();
		
		for(String win:Windows)
		{
			if(!win.equalsIgnoreCase(parentwin))
			{
				driver.switchTo().window(win);
			}			
		}
		
		driver.switchTo().window(parentwin);
		
		
	}

	public void ExcelOperation(String path) throws IOException, InvalidFormatException {
		//read cell
		
		
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		cell.getStringCellValue();
		
		
		//write cell
		Cell cell2 = row.createCell(1);
		cell2.setCellValue("Hello world");
		fis.close();
		
		FileOutputStream ofstream = new FileOutputStream(path);
		wbook.write(ofstream);
		
		ofstream.close();
		wbook.close();

	}
	
	public void readAllValues(String path,int sheetnum) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(sheetnum);
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				System.out.println(cell.getStringCellValue());
			}
		}
		
	}
	
	
	

}
