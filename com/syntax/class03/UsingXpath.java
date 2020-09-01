package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
		driver.findElement(By.xpath("//a[starts-with(text(), 'View all o')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(), 'Log')]")).click();
		
		
		
	}

}
