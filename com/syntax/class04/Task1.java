package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id= 'txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@class= 'button']")).click();

		WebElement SyntaxLogo = driver.findElement(By.xpath("//img[@width= '283']"));
		if(SyntaxLogo.isDisplayed()) {
			System.out.println("Syntax Logo is displayed");
		}else {
			System.out.println("Syntax Logo is not displayed");
		}

	}

}
