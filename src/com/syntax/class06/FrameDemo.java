package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();//uitestpractice.com url
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		/*
		 * we can switch a frame using three different methods
		 * 1.by index();
		 * 2.by name or id
		 * by WebElement 
		 */
		
		//By index
		driver.switchTo().frame(0);		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Sabah");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//by name or id
		driver.switchTo().frame("iframe_a");
		name.clear();
		name.sendKeys("Khalid");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//by WebElement
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Edwin");
		driver.switchTo().defaultContent();//switch back to main window/page/default content
		
		
		
		
		
		
		Thread.sleep(1000);
		tearDown();
	}

}
