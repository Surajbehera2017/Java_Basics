package com.popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PopUphandling {

	public static void main(String[] args) 
	{
	WebDriver driver  = new FirefoxDriver();
	
	driver.navigate().to("http://demo.guru99.com/popup.php");
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	Set<String> A = driver.getWindowHandles();
	
	for(String window:A)
	{
		driver.switchTo().window(window);	
	}
	
	driver.findElement(By.name("emailid")).sendKeys("suraj@test.com");
	driver.findElement(By.name("btnLogin")).click();
	driver.close();
	
	Set<String> B = driver.getWindowHandles();
	for(String Window:B)
	{
	driver.switchTo().window(Window);
	
	}
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	
	driver.quit();
	
	}
}
