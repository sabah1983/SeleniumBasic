package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {

	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx/";

	public static String userName="Tester";
	
	public static String password="test";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement userNam = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		userNam.clear();
		userNam.sendKeys(userName);
		Thread.sleep(3000);

		WebElement pass = driver.findElement(By.cssSelector("input[name*='$password']"));
		pass.clear();
		Thread.sleep(3000);
		pass.sendKeys(password);

		WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
		Thread.sleep(3000);
		loginBtn.click();
		// loginBtn.submit();

		WebElement user = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		user.sendKeys(userName);

		WebElement passwor = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		passwor.sendKeys(password);

		WebElement login = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
		login.click();

		boolean logoIsDisplayed = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[1]/h1"))
				.isDisplayed();
		if (logoIsDisplayed) {
			System.out.println("Logo is displayed, and Test case passed");
		} else {
			System.out.println("Logo is Not displayed, and test case failed");
		}

		WebElement loginInfo = driver.findElement(By.xpath("//div[@class='login_info']"));
		String text=loginInfo.getText();//used to retrieve the inner text of a web element 
		
		if(text.contains(userName)) {
			System.out.println("User successfuly logged in, and Test case passed");
		}else {
			System.out.println("User not logged in, and Test case failed");
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
