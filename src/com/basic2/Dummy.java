package com.basic2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dummy 
{
	Dummy(String s)
	{
		System.out.println("inside dummy constructor");
	}
	
	public static void main()
	{
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.className(""));
		act.moveToElement(ele);
		
		Select sel = new Select(ele);
		
		
	}
}
