package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static String url = "http://uitestpractice.com/Students/Switchto";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame(0);
		WebElement textBox=driver.findElement(By.id("name"));
		textBox.sendKeys("Batch 7");
		
		driver.switchTo().defaultContent();
		
		WebElement clickOnLink= driver.findElement(By.xpath("//h3[text() = 'click on the below link: ']"));
		String text = clickOnLink.getText();
		System.out.println(text);
		
		driver.switchTo().frame("iframe_a");
		textBox.clear();
		textBox.sendKeys("Syntax");
		
		driver.switchTo().defaultContent();
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(iframe);
		textBox.clear();
		textBox.sendKeys("Hi There");
		
	}

}
