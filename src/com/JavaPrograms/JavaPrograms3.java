package com.JavaPrograms;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.unix.X11.Window;

public class JavaPrograms3 {

	static WebDriver driver;
	public static void main(String[] args)
	{
		
		
		
	}
	
	void select()
	{
		driver = new FirefoxDriver();
		WebElement SelectElement = driver.findElement(By.xpath(""));
		 Select select = new Select(SelectElement);
		
		 select.selectByIndex(0);
		 select.selectByValue("");
		 select.selectByVisibleText("");
		 
	}
	
	void windowSelect()
	{
		String presentWindow;
		
		presentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		 if(Window.SIZE>1)
		 {
			 for(String win:windows)
			 {
				 if(!win.equalsIgnoreCase(presentWindow))
				 {
					 driver.switchTo().window(win);
				 }
				 
			 }
			 
		 }
		
	}
	
	void alert()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		
		al.accept();
		al.dismiss();
		al.sendKeys("");
		
	}
	
	void frame()
	{
		driver.switchTo().frame("");
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("")));
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}
	
	void screenshot() throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(""));
		//driver.findElement()
	}
	
	void excelOperation() throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell col = row.getCell(0);
		
		System.out.println(col.getStringCellValue());
		
		for(Row row2:sheet)
			for(Cell cell2:row)
			{
				System.out.println(cell2.getStringCellValue());
			}
		
		col.setCellValue("");
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("");
		wbook.write(fos);
		
		fos.close();
		
	}
	
	void actions()
	{
		
		Actions action = new Actions(driver);
		action.contextClick();		
		action.clickAndHold();
		action.dragAndDrop(driver.findElement(By.name("")), driver.findElement(By.name("")))
		.build().perform();
				
	}
	
	
	class Ielement implements WebElement
	{

		@Override
		public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void click() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public WebElement findElement(By arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<WebElement> findElements(By arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getAttribute(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCssValue(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Point getLocation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Rectangle getRect() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Dimension getSize() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getTagName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSelected() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void sendKeys(CharSequence... arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void submit() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
}
