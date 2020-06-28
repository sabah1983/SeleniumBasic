package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();//Open chrome browser and lunch Syntax Practice Site
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekDD);
		
		/*
		 * Selenium provids three different ways to select a value from dropdown
		 * 1. .byIndex();
		 */
		
		List<WebElement> options=select.getOptions();//Return List of options in the DD
		System.out.println("Number of options in the DD are "+options.size());
		
		//select.selectByIndex(3);
		
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);			
		}
	
		//2.by selectByVisibleText(String str);
		
		select.selectByVisibleText("Friday");
		
		//3. .selectByvalue();
		
		for (WebElement option : options) {//loop on above options list
			
			String text=option.getText();
			System.out.println(text);
			
			if(text.equals("Wednesday")) {
				option.click();
				String ddText=option.getText();
				if(ddText.equals("Wednesday")) {
					System.out.println("Wednesday is selected ::"+option.isSelected());
				}else {
					System.err.println("Wednesday is not selected");
				}
			}
		}

		//Return boolean value if we have multiple checks
		boolean isMultiple=select.isMultiple();
		System.out.println("The continents of DD is Multiple "+isMultiple);
		
		Thread.sleep(3000);
		tearDown();
	}

}
