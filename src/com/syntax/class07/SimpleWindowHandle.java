package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://accounts.google.com/signup");		
		String signUpTitle=driver.getTitle();
		System.out.println("Main page title is "+signUpTitle);		
		driver.findElement(By.linkText("Help")).click();
		
		/*
		 * How to get window handle
		 * In Selenium we have two methods to get the handle or the window.
		 * getWindowHandle();
		 * getWindowHandles();
		 */
		
		//Return set of string IDs of all windows currently opened by the current instance 
		Set<String> allWindowahndles=driver.getWindowHandles();
		//Get size of the SET
		System.out.println("Number of windows opened are "+allWindowahndles.size());
		
		Iterator<String> it=allWindowahndles.iterator();
		String mainWindowHandle=it.next();//Returns ID for main window
		System.out.println("ID of main window is "+mainWindowHandle);
		String childWindowHandle=it.next();//Returns ID for child window
		System.out.println("ID of child window is "+childWindowHandle);
		
		//Using switchTo method we switch to another window by passing the handle/ID of the window.
		driver.switchTo().window(childWindowHandle);
		String childWindowTitle=driver.getTitle();
		System.out.println("Child page title is "+childWindowTitle);
		driver.close();
	}

}
