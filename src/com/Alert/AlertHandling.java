package com.Alert;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AlertHandling 
{
	static FirefoxDriver driver;
	public static void main(String args[]) throws InterruptedException
		{
		
		File file = new File("D:\\Firefox25\\firefox.exe");
		FirefoxBinary Fbinary = new FirefoxBinary(file);
		FirefoxProfile fprof = new FirefoxProfile();
		
		driver= new FirefoxDriver(Fbinary, fprof);
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='pushAlert()']")).click();
		
		Alert_Verify();
		Alertaction();
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
		sendkeys("Yes");
		
		driver.close();
		}
	
	public static void Alert_Verify()
	{
		/*Alert al2 = new Alert(driver);
		al2.accept();*/
		
		
		Alert al = driver.switchTo().alert();
		String alermsg = al.getText();
		System.out.println(alermsg);
		
	}
	
	static void Alertaction()
	{
		Alert alr = driver.switchTo().alert();
		alr.accept();
	}
	
	static void sendkeys(String value) throws InterruptedException
	{
		Alert al = driver.switchTo().alert();
		al.sendKeys(value);
		
		Thread.sleep(3000);
		al.accept();
		
	}
}

