package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	
	/*
	 * Commands with page
	 * getCurrentURL();
	 * get();
	 * getTitle();
	 */
	
	public static void main(String[] args) {
		
		String fbUrl="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get(fbUrl);
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
		String title=driver.getTitle();
		System.out.println("The title of the page is: "+title);
		
		driver.close();
		
	}

}
