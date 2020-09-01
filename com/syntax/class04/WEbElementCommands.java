package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbElementCommands {
	public static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement ageRadioBtn = driver.findElement(By.xpath("//input[@value = '0 - 5']"));
		System.out.println(ageRadioBtn.isEnabled());
		System.out.println(ageRadioBtn.isDisplayed());
		System.out.println("Before clicking " + ageRadioBtn.isSelected());
		ageRadioBtn.click();
		System.out.println("After clicking " + ageRadioBtn.isSelected());

	}
}
