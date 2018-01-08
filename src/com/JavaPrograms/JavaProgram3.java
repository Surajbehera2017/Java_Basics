package com.JavaPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaProgram3 {

	static WebDriver driver;
	//select
	public void select()
	{
	
		try{
			
			WebElement ele1=driver.findElement(By.xpath(""));
			Select select = new Select(ele1);
			select.selectByIndex(1);
			select.selectByValue("");
			select.selectByVisibleText("");
			String selectedValue = select.getFirstSelectedOption().getText();
			System.out.println(selectedValue);
			
		}catch(Exception e1){
			
			
		}
		
	}
	
	/*
	 * actions
	 */
	
	void actions()
	{
		try{
			WebElement ele1 = driver.findElement(By.className(""));
			WebElement ele2 = driver.findElement(By.className(""));
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.className("")))
			.contextClick().build().perform();
			
			action.clickAndHold(driver.findElement(By.className("")))
			.dragAndDrop(ele1, ele2)
			.build()
			.perform();
		
			
		}catch(Exception e1)
		{
			
		}
		
	}
	
	/*
	 * Window
	 * 
	 */
	
	void window()
	{
		try{
			
			String window = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			
			for(String win:windows)
			{
				if(win!=window)
				{
					driver.switchTo().window(win);
				}
				
			}
			
			driver.switchTo().window(window);
			
			
		}catch(Exception e1){
		
		}
		
	}
	
	/*
	 * Alert
	 */
	
	void alert()
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		al.accept();
		al.dismiss();
		al.sendKeys("");
		
	}
	
	/*
	 * Frame
	 */
	void frame()
	{
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("")));
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();		//switch to the main frame
		driver.switchTo().parentFrame();		//switch to the current parent frame
	}
	
	/*
	 * dealing with excel 
	 */
	
	void excelOperations() throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		cell.setCellValue("");
		
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("");
		wbook.write(fos);
		
		fos.close();
		
	}
	
	
	/*
	 * Dealing with webtables
	 */
	
	void webTableOperations()
	{
		//finding a particular cell
		int rowNum = 1;
		int colNum = 2;
		WebElement table = driver.findElement(By.name(""));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		List<WebElement> tableColumns = tableRows.get(rowNum).findElements(By.tagName("td"));
		
		System.out.println(tableColumns.get(colNum));
		
		for(WebElement ele:tableColumns)
		{
			System.out.println(ele.getText());
		}
		
	}
	
	/*
	 * ScreenShot
	 */
	void screenshot() throws IOException 
	{
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(""));
		
	}
	
	void reflection(String methodName) throws NoSuchMethodException, SecurityException, Exception
	{

		Method execute = getClass().getMethod(methodName);
		execute.invoke(this);

	}
	
	
	
	
	
	
}
