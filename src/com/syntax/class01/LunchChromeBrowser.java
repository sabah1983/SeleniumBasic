package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) {
		
		//making connection to the diver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		//opening the browser by calling the constructor of ChromeDriver class and upcasting
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
