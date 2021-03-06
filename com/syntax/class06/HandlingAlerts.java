package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static String url = "http://www.uitestpractice.com/Students/Switchto";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement confirmationAlertButton = driver.findElement(By.id("confirm"));
		confirmationAlertButton.click();
		Thread.sleep(5000);
//		Alert confirmAlert = driver.switchTo().alert();
//		confirmAlert.dismiss();
		Alert alert = driver.switchTo().alert();
		String confirmAlertText = alert.getText();
		System.out.println(confirmAlertText);
		// handling confirmation alert
		alert.dismiss();
		Thread.sleep(5000);
		WebElement promptAlertButton = driver.findElement(By.id("prompt"));
		promptAlertButton.click();
		Thread.sleep(5000);

		alert.sendKeys("Syntax");
		Thread.sleep(5000);
		alert.accept();
	}
}