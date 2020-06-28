package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

	public static void main(String[] args) {
		/*
		 * open chrome browser
		 * go to https://www.amazon.com/
		 * get all links
		 * get number of links that has text
		 * print to console only the links that has text
		 */
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Links on amazon are "+list.size());
		
		int count=0;
		for (WebElement webElement : list) {
			String text=webElement.getText();
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
			
		}
		System.out.println("Total number of links are "+count);
		driver.quit();
		

	}

}
