package com.Practice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Practice1 {

	public static void main(String[] args) {
		
		System.out.println("main");
		System.setProperty("webdriver.gecko.driver", "D:\\Suraj\\AUTOMATION\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Alert
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys("");
		al.getText();

		//Explicit Wait
	    
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		 
		 
		 
		//Window
		String window = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String currentWin : allWindow)
		{
			if(!currentWin.equalsIgnoreCase(window))
			{
				driver.switchTo().window(currentWin);
			}			
		}
		
		driver.switchTo().window(window);
		
		//Frames
		
		driver.switchTo().frame("index");
		driver.switchTo().frame("name");
		driver.switchTo().frame("webElement");
		
		
		//
		System.out.println("out main");
		}
	
	
		static {
	         System.out.println("Message");
	        // System.exit(0);
	    } 

		public void fluentwait()
		{
			
			
		}
		
}
