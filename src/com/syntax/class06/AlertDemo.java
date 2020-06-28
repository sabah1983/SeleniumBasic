package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.setUp();// below code is for UItestPractice.com

		driver.findElement(By.xpath("//button[@id='alert']")).click();

		// handling simple alert/popups
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String simpleAText = simpleAlert.getText();
		System.out.println("This is simple alert text " + simpleAText);
		Thread.sleep(1000);
		simpleAlert.accept();
		Thread.sleep(1000);

		// handling confirmation alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmAText = confirmAlert.getText();
		Thread.sleep(1000);
		System.out.println("This is confirm text " + confirmAText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		Thread.sleep(1000);

		// handling prompt alerts/confirmation alerts by providing some confirmation
		// message
		String name="Sabah";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("This is Prompt alert text ::" + promptAlert.getText());
		Thread.sleep(1000);
		promptAlert.sendKeys(name);
		Thread.sleep(1000);
		promptAlert.accept();

		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("Text added to alert box :: "+text);
		if (text.contains(name)) {
			System.out.println("Text "+name+" was successfully added");
		} else {
			System.err.println("Text "+name+" was not entered");
		}

		Thread.sleep(1000);
		BaseClass.tearDown();
	}

}
