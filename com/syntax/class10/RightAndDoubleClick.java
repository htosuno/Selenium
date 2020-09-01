package com.syntax.class10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {
	public static String url = "http://demo.guru99.com/test/simple_context_menu.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement rightClickButton= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(rightClickButton).perform();
		WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
		action.click(edit).perform();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		action.doubleClick(doubleClickButton).perform();
//		alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();		
		
	}

}
