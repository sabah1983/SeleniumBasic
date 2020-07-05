package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		driver.switchTo().frame("FrameOne");
		boolean logoIsDis=driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("Logo inside frame is displayed:: "+logoIsDis);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean enrolBtnIsEnable=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enrol button inside frame two is enable:: "+enrolBtnIsEnable);
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		BaseClass.tearDown();
	}

}
