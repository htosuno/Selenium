package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static String url = "http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("FrameOne");
		WebElement logo = driver.findElement(By.id("hide"));
		System.out.println("logo displayed " + logo.isDisplayed());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		WebElement button=driver.findElement(By.xpath("//a[text()='Enroll Today']"));
		System.out.println("button enabled " + button.isEnabled());

	}

}
