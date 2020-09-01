package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String mainPageHandle = driver.getWindowHandle();
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
//		WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
//		newWindowMessage.click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		Iterator<String> it = allWindowHandles.iterator();
		while (it.hasNext()) {
			String handle = it.next();
			if (!handle.equals(mainPageHandle)) {
				driver.switchTo().window(handle);

				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println(text.getText());

				driver.close();

			}
		}
		driver.switchTo().window(mainPageHandle);
		driver.close();


	}

}
