package com.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report 
{
	static WebDriver driver;
	static ExtentReports reportinstance;
	static ExtentTest logger;
	static String current;
	static int testname;
	
	public long timeStamp()
	{
		Date date = new Date();
		
		long timestamp= date.getTime();
		System.out.println(timestamp);
		return timestamp;
	}
	
	public void StartReport() throws IOException
	{
		System.out.println("inside start report");
		File currentPath = new File(".");
		current = currentPath.getCanonicalPath();
		long TS = timeStamp();
		reportinstance  = new ExtentReports(current+"\\Extent reports\\reports"+TS+".html",true);
		reportinstance.addSystemInfo("Environment", "Env1")
		.addSystemInfo("Username", "suraj")
		.addSystemInfo("Selenium-Version", "2.53");
		
		
	}
	public void startTest(String testname, String desc)
	{
		logger= reportinstance.startTest(testname, desc);
		
	}
	
	public void addstep_pass(String stepName, String details) throws Exception
	{
		Thread.sleep(5000);
		System.out.println("inside addstep");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(current+"\\Extent reports\\Screenshots\\sc1.png");
		FileUtils.copyFile(scrFile, new File(current+"\\Extent reports\\Screenshots\\sc2.png"));
		System.out.println(current+"\\Extent reports\\Screenshots\\sc1.png");
		
		
		logger.log(LogStatus.PASS, stepName+logger.addScreenCapture(current+"\\Extent reports\\Screenshots\\sc2.png"), details);		
		logger.log(LogStatus.PASS, stepName, details);
	}
	public void addstep_fail(String stepName, String details) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(current+"\\Extent reports\\Screenshots\\sc2.png"));
		logger.log(LogStatus.FAIL, stepName+logger.addScreenCapture(current), details);		
	}
	public void endTest()
	{
		reportinstance.endTest(logger);
		
	}
	public void closeReport()
	{
		
		reportinstance.flush();
		reportinstance.close();
	}
	@BeforeClass
	public void beforeSuite() throws IOException
	{
		StartReport();	
	}
	
	/*@Test
	public void test1() throws Exception
	{
		startTest("TC_1", "Demo test case 1");
		FirefoxBinary fbin = new FirefoxBinary(new File("D:\\Firefox25\\firefox.exe"));
		FirefoxProfile fprof = new FirefoxProfile();
		driver = new FirefoxDriver(fbin,fprof);
		driver.get("http://google.co.in");
		addstep_pass("Login", "Login");
		//addstep_fail("Step 2", "Demo fail");
		System.out.println("end of test cases. 1");
		endTest();
	}*/
	
	/*
	@Test(expectedExceptions ={ ArithmeticException.class,NoSuchElementException.class})
	public void test2() throws Exception
	{
		//int a = 10/0;
		startTest("TC_2", "Demo test case 2");
		Scanner in = new Scanner(System.in);
		int input =in.nextInt();
		System.out.println(input);
		FirefoxBinary fbin = new FirefoxBinary(new File("D:\\Firefox25\\firefox.exe"));
		FirefoxProfile fprof = new FirefoxProfile();
		driver = new FirefoxDriver(fbin,fprof);
		driver.get("http://google.co.in");
		WebElement ele = driver.findElement(By.xpath("sajsaoj"));
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File( "D:/scr.png"));
		addstep_pass("Login", "Login");
		//addstep_fail("Step 2", "Demo fail");
		System.out.println("end of test cases. 2");
		endTest();
		driver.quit();
	}
	*/
	@Test
	public void upload() throws Exception
	{
		
		//http://demoqa.com/registration/
			

			startTest("TC_1", "Demo test case 1");
			FirefoxBinary fbin = new FirefoxBinary(new File("D:\\Firefox25\\firefox.exe"));
			FirefoxProfile fprof = new FirefoxProfile();
			driver = new FirefoxDriver(fbin,fprof);
			driver.get("http://demoqa.com/registration/");
			driver.findElement(By.id("profile_pic_10")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			addstep_pass("Login", "Login");
			//addstep_fail("Step 2", "Demo fail");
			System.out.println("end of test cases. 1");
			endTest();
		
	}
	
	@AfterClass
	public void aftersuite()
	{
		closeReport();
	}
}
