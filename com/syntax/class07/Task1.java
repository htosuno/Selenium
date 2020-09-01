package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static String url = "http://www.uitestpractice.com/Students/Contact";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement homeButton = driver.findElement(By.linkText("This is a Ajax link"));
		homeButton.click();
		WebElement paragraph = driver.findElement(By.className("ContactUs"));
		System.out.println(paragraph.getText());

	}

}
