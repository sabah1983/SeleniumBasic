package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
	
	public static void main(String[] args) {
		
		
		//making connection to the diver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		//opening the browser by calling the constructor of ChromeDriver class and upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("http://test:test@abcdatabase.com/basicauth");
	}

}
