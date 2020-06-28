package com.syntax.class05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> expectedList=new ArrayList<>();
		expectedList.add("Please select");
		expectedList.add("Sunday");
		expectedList.add("Monday");
		expectedList.add("Tuesday");
		expectedList.add("Wednesday");
		expectedList.add("Thursday");
		expectedList.add("Friday");
		expectedList.add("Saturday");
		
		setUp();
		
		WebElement continents=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(continents);
		
		select.selectByValue("Thursday");
		
		List<WebElement> optionList=select.getOptions();

		Iterator<WebElement> it=optionList.iterator();
		while(it.hasNext()) {
			String text=it.next().getText();
			System.out.println(text);
		}
		
		if(expectedList.containsAll(optionList)) {
			System.out.println("The list matches");
		}else {
			System.err.println("List did not match");
		}
		
		Thread.sleep(2000);
		tearDown();
		
	}

}
