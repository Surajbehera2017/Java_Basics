package com.JavaPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice2 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void select()
	{
		Select sel = new Select(driver.findElement(By.name("")));
		sel.selectByIndex(0);
		sel.selectByValue("");
		sel.selectByVisibleText("");
	}
	
	public static void Alert()
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent() );
		Alert Al = driver.switchTo().alert();
		
		Al.accept();
		Al.dismiss();
		Al.sendKeys("");
		Al.getText();
	}
	
}
