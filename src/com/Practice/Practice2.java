package com.Practice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice2 
{
	static int c;	//static variable
	int a ;		//Instance variable
	
	//default Constructor will be included in the source code if u are not declaring any constructor in the program
	// No Argument Constructor
	Practice2()
	{
		String S1 = "Hello";
		System.out.println(S1);		
	}
	
	//Parameterized Constructor
	Practice2(int S1)
	{
		a=S1;
		System.out.println(S1);
	}
	
	//Copy Constructor
	Practice2(Practice2 pract)
	{
		a = pract.a;	
		System.out.println(a);
	}
	
	
	public static void main(String[] args)
	{
		
		//	dummy2();
		Practice2 pract = new Practice2(1);
		Practice2 pract2 = new Practice2(pract);
		
	}
	
	public void dummy1()
	{
		int b ;		//Local Variable	needs to initialized before using it	
		
		
		//Alert
				WebDriver driver = new FirefoxDriver();
				Alert al = driver.switchTo().alert();
				al.accept();
				al.dismiss();
				al.sendKeys("");

				//select
				WebElement ele = driver.findElement(By.cssSelector(""));
				Select sel = new Select(ele);
				sel.selectByIndex(1);
				sel.selectByValue("");
				sel.selectByVisibleText("");
				
				//window switching
				String win1 = driver.getWindowHandle();
				
				Set<String> wins = driver.getWindowHandles();
				for(String winc : wins)
				{
					if(!winc.equals(win1))
					{
						driver.switchTo().window(winc);
					}
				}
				
				driver.switchTo().window(win1);
				
				//Frames
				
				driver.switchTo().frame(1);		//changing frame using the index
				driver.switchTo().frame(ele);	//changing frame using the webelement
				driver.switchTo().frame("");		//changing using name
				driver.switchTo().parentFrame();	//switch back to the parent frame
				driver.switchTo().defaultContent(); 	//Most parent frame
				
				//Actions class
				
				Actions act = new Actions(driver);
				act.moveToElement(ele)
				.click().build().perform();
				
				act.contextClick(ele).perform();
				
				act
				.moveToElement(ele).clickAndHold()
				.click(ele).build().perform();
				
	}
	
	public static void dummy2()
	{
		
		
		String str1 = new String("Suraj1");
		String str2 = new String("Suraj1");
		String str3 = "Suraj1";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
	}
	
	
}
