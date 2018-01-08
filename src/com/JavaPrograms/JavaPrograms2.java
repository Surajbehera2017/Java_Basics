package com.JavaPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.steadystate.css.util.Output;

public class JavaPrograms2 {

	static WebDriver driver;
	public static void main(String[] args) {
	

	}
	
	
	public void select()
	{
		
		driver = new FirefoxDriver();
		driver.get("");
		WebElement ele = driver.findElement(By.name(""));
		Select sel = new Select(ele);
		
		sel.selectByIndex(4);
		sel.selectByValue("");
		sel.selectByVisibleText("");
		
		sel.deselectAll();
		sel.getFirstSelectedOption();
	}
	
	public void action()
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.name("")));
		act.clickAndHold(driver.findElement(By.name("")))
		.moveToElement(driver.findElement(By.name("")))
		.build().perform();
		
		act.dragAndDrop(driver.findElement(By.name("")), driver.findElement(By.name("")));
		
	}
	
	public void  alert()
	{
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver,3);
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		//al = driver.
		al.accept();
		al.dismiss();
		al.sendKeys("");
		al.getText();
	}
	
	public void windows()
	{
		String window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for(String win:windows)
		{
			if(win!=window)
			{
				
				driver.switchTo().window(win);
			}	
		}
		
	}
	
	public void frame()
	{
		driver.switchTo().frame("");
		driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.name("")));
	}
	
	
	public void excelOperations() throws IOException
	{
		//Reading value
		
		FileInputStream fis = new FileInputStream(new File(""));
		XSSFWorkbook wbook= new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		Row row = sheet.getRow(10);
		Cell cell = row.getCell(0);
		
		String val = cell.getStringCellValue();
		System.out.println("");

		//Entering cell value
		
		cell.setCellValue("String");
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("");
		wbook.write(fos);
		
		fos.close();
		
	}
	
	public void screenShot() throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(""));
		WebElement ele = driver.findElement(By.xpath(""));
		ele.click();
	}
	
	
		 
	
}
