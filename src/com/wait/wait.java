package com.wait;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	static WebDriver driver;
	public static void Explicit_wait(String locator,int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='menu_form_id:loadingPanelContentTable']/tbody/tr/td/img")));
	}
	static void click(String locator)
	{
		Explicit_wait("//*[@id='IDHeaderRight']/div[1]/input", 30);
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void main(String[] args) 
	{
		FirefoxBinary FBinary = new FirefoxBinary(new File("D://Firefox25//firefox.exe"));
		FirefoxProfile FProfile = new FirefoxProfile();
		driver = new FirefoxDriver(FBinary,FProfile);
		driver.get("http://upmsit2.dls.deutsche-leasing.de:81/siteminderagent/ias/forms/ias_login.fcc?TYPE=33554433&REALMOID=06-0006acf7-5a07-18c8-ad42-4182ac1ad02d&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=aiwEHU0wZY1129fJQRUgRxf6stM7RalxTIIg0m3MNlBV8tUVzb3JgDlhlG0roIhL&TARGET=-SM-http%3a%2f%2fupmsit2%2edls%2edeutsche--leasing%2ede%3a81%2fAS%2fmanual--login--upm");
		driver.manage().window().maximize();
		driver.findElement(By.name("USER")).sendKeys("UPM_R1");
		driver.findElement(By.name("PASSWORD")).sendKeys("Upmsit2014");
		driver.findElement(By.xpath("//*[@id='loginbox_submit']/strong")).click();
		
		
		String parent = driver.getWindowHandle();
		System.out.println("parent"+parent);
		
		Set<String> windows = driver.getWindowHandles();
	
		for(String win:windows)
		{
			
			System.out.println(win);
			if(!win.equals(parent))
			{
			driver.switchTo().window(win);
			}
		}
		
		Explicit_wait("//*[@id='IDHeaderRight']/div[1]/input", 30);
		driver.findElement(By.xpath("//*[@id='upmstart1:PAR_SER_SUC_FN_TXT']")).sendKeys("Test UPM");
		click("//*[@id='upmstart1:PAR_SEARCH_ID']");
		click("//*[@id='upmstart1:PAR_SEARCH_ADD_ID']");
			
	}

}
