package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	public static String url = "http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement alertButton1 = driver.findElement(By.cssSelector("button[onclick*= myAlert]"));
		alertButton1.click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		String alertText = alert1.getText();
		System.out.println(alertText);
		// handling confirmation alert
		alert1.dismiss();
		
		WebElement alertButton2 = driver.findElement(By.cssSelector("button[onclick*= myConfirm]"));
		alertButton2.click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println( alert2.getText());
		// handling confirmation alert
		alert2.accept();
		
		WebElement alertButton3 = driver.findElement(By.cssSelector("button[onclick*= myP]"));
		alertButton3.click();
		Thread.sleep(1000);
//		Alert alert3 = driver.switchTo().alert();
		System.out.println( alert2.getText());
		// handling confirmation alert
//		Thread.sleep(5000);
		alert2.sendKeys("Syntax");
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(1000);

//		driver.close();

	}

}
