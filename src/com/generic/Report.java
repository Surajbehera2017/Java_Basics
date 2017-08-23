package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
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
	
	public void StartReport() throws IOException
	{
		System.out.println("inside start report");
		File currentPath = new File(".");
		current = currentPath.getCanonicalPath();
		reportinstance  = new ExtentReports(current+"\\Extent reports\\reports.html",true);
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
		FileUtils.copyFile(scr, new File(current));
		logger.log(LogStatus.FAIL, stepName+logger.addScreenCapture(current), details);		
	}
	
	public void closeReport()
	{
		reportinstance.endTest(logger);
		reportinstance.flush();
		reportinstance.close();
	}
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
	StartReport();	
	startTest("TC_1", "Demo test case 1");
	}
	
	@Test
	public void test1() throws Exception
	{
		FirefoxBinary fbin = new FirefoxBinary(new File("D:\\Firefox25\\firefox.exe"));
		FirefoxProfile fprof = new FirefoxProfile();
		driver = new FirefoxDriver(fbin,fprof);
		driver.get("http://google.co.in");
		addstep_pass("Login", "Login");
		//addstep_fail("Step 2", "Demo fail");
		System.out.println("end of test cases.");
	}
	@AfterSuite
	public void aftersuite()
	{
		closeReport();
	}
}
