package com.syntax.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";
		//System.out.println(filePath);
		//String filePath1="/Users/sabahabdaullah/eclipse-workspace/SeleniumBasics/configs/configuration.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver=new FirefoxDriver();
			break;					
		}
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
