package com.JavaPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.exc.CodeConstraintException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class JavaPrograms {

	public static JavaPrograms JavaPrograms() {
		return new JavaPrograms();
	}

	public static void main(String[] args) throws ClientProtocolException, IOException {

		//JavaPrograms().Max3numbers(15,11,30);
		//JavaPrograms().swap2numbers(100,8);
		//JavaPrograms().fabonacci(100);
		
		//JavaPrograms().sumOfDigits(718);
		//JavaPrograms().factorial(10);
		//JavaPrograms().findBrokenLinks();
		//JavaPrograms().Maps();
		JavaPrograms().autoIt();
	}
	//Maximum of 3 numbers
	public void Max3numbers(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a is greatest");
		}

		else if (a > b && a < c) {
			System.out.println("C is Greatest");
		}

		else {
			System.out.println("B is greatest");
		}
	}
	
	//Swap 2 numbers W/O using 3rd variable
	public void swap2numbers(int a ,int b)
	{
		System.out.println(a+"   "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+"   "+b);
	}
	
	//Fabonacci Number
	
	public void fabonacci(int num)
	{
		int a = 1;
		int b = 1;
		int c=a+b;
		System.out.println(a+"\n"+b+"\n"+c);
		
		for(int i=0;i<num;i=c)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			
		}
		
	}
	
	//sum of the digits  718
	
	public void sumOfDigits(int num)
	{
		int a=num/10;
		int c=num%10;
		int b=a/10;
		a = a%10;
		System.out.println(a+b+c);
	}

	//Factorial
	public void factorial(int num)
	{
		int n = 1;
		for(int i=num;i>0;i--)
		{
			n=n*i;
		}
		System.out.println(n);
	}
	
	//Reverse the number
	public void reverse(int num)
	{
		//for()
		int a=num/10;
		int b = a%10;
		
		
		
		
	}
	
	
	public void setProxy()
	{
		String proxy = "172.25.114.13:8080";
		org.openqa.selenium.Proxy PROXY = new org.openqa.selenium.Proxy();
		PROXY.setHttpProxy(proxy)
		.setFtpProxy(proxy)
		.setSslProxy(proxy);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, PROXY);
		
		WebDriver driver = new FirefoxDriver(cap);
		
	}
	public void findBrokenLinks() throws ClientProtocolException, IOException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Suraj\\AUTOMATION\\Jars\\geckodriver.exe");
		
		//FirefoxBinary fbin = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
		//FirefoxProfile fprof = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver();
		String URL = "http://demoqa.com/registration/";
		driver.get(URL);
		
		List<WebElement> alllinks;
		alllinks = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:alllinks)
		{
			String link = ele.getAttribute("href");
			System.out.println(link);
			
			Connection connect;
			int response = JavaPrograms().getResponse(link,URL);
					
		}
	}
	
	public int getResponse(String link, String URL) throws ClientProtocolException, IOException
	{
		/*
	
		org.apache.http.client.HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(link);
		org.apache.http.HttpResponse response = client.execute(request);
	
	*/
		URL Link = new URL(link);
		HttpURLConnection connect = (HttpURLConnection)Link.openConnection();
		connect.setConnectTimeout(10000);
		
		connect.connect();
		int responsecode = connect.getResponseCode();
		
		//int responsecode =  response.getStatusLine().getStatusCode();
		
		   System.out.println(responsecode);
		   return responsecode;
	}
	/*
	public void practice()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Suraj\\AUTOMATION\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "http://demoqa.com/registration/";
		driver.get(URL);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByid("name_3_firstname").value = Suraj");
	}
	*/
	
	public void Maps()
	{
		Map<Integer,String> m1 = new HashMap() ;
		m1.put(0, "Test1");
		m1.put(1, "Test2");
		m1.put(2, "Test3");
		m1.put(3, "Test4");
		
		for(Entry ent:m1.entrySet())
		{
			System.out.println(ent.getValue());
			
	
		}
		
		
		List<String> li = new ArrayList();
		li.add("S1");
		li.add("S2");
		li.add("S3");
		
		for(String l:li)
		{
			System.out.println(l);
		}
		
		
		
		
	}
	
	public void autoIt() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Suraj\\AUTOMATION\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
		
		driver.findElement(By.name("profile_pic_10")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		Runtime.getRuntime().exec("D:\\Suraj\\AUTOMATION\\UploadFile.exe");
		driver.findElement(By.name("pie_submit")).click();;
		
		
	}
	
}
