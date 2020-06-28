package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	
	public static String url="https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//WebElement femalRadioB=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		WebElement femalRadioB=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		
		System.out.println(femalRadioB.getAttribute("id"));
		
		System.out.println(femalRadioB.isDisplayed());//we are expect true
		System.out.println(femalRadioB.isEnabled());//true
		System.out.println(femalRadioB.isSelected());//false
		System.out.println("***************");
		//first way to click on Radio Buttons
		femalRadioB.click();
		System.out.println(femalRadioB.isSelected());
		
		//second way to click on Radio Buttons
		List<WebElement> checkBox=driver.findElements(By.xpath("//*[@id=\"subjects-label\"]"));
		
		int listSize=checkBox.size();
		System.out.println("Size of CheckBox are: "+listSize);
		
		for (WebElement webElement : checkBox) {
			if(webElement.isEnabled()) {
				String value=webElement.getAttribute("id");
				System.out.println(value);
				
			}
		}
		

	}

}
