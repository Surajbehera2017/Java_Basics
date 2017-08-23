package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class Demo {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		FirefoxBinary bin = new FirefoxBinary(new File("D:\\Firefox25\\firefox.exe"));
		FirefoxProfile prof = new FirefoxProfile();
		driver = new FirefoxDriver(bin,prof);
		String URL="http://google.co.in";
		driver.get(URL);
		//To check the status of the URL passed
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		HttpResponse response = client.execute(request);
		System.out.println(response.getStatusLine());
		
		/*we can use the below code also, need to download rest-assured jar
		public int httpResponseCodeViaGet(String url) {
            return RestAssured.get(url).statusCode();
    	}
 
	    public int httpResponseCodeViaPost(String url) {
	        return RestAssured.post(url).statusCode();
	    }	
		*/
		
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		ele3.sendKeys("Redbus");
		
		Thread.sleep(3000);
		//WebElement ele = driver.findElement(By.xpath("//div[@id='sbse0']/div[2]"));
		//WebElement ele= driver.findElement(By.cssSelector("[class$=bqs_c]")); ----------using ends with for CSS
		WebElement ele= driver.findElement(By.cssSelector("[class^=sbqs_c]"));  //-----------using starts with for CSS
		
		/*Select sel = new Select(ele);
		sel.selectByIndex(1);
		sel.selectByVisibleText("");
		sel.selectByValue("");
		*/
		//Actions
		/*WebElement ele2 = driver.findElement(By.linkText(""));
		Actions act = new Actions(driver);
		
		act.clickAndHold(ele)
		.clickAndHold(ele2)
		.click()
		.build()
		.perform();
		*/
		//click on dropdown and select the perticular option
		Actions act = new Actions(driver);
		act.moveToElement(ele)
		.click(ele)
		.build()
		.perform();
		
		/*
		Alert al= driver.switchTo().alert();
		al.getText();
		al.sendKeys("");
		al.accept();
		al.dismiss();
		driver.switchTo().alert().accept();
		*/
		
		/*
		File Ifile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Ifile, new File(""));
		*/
		
	}

}
