package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDD {
	public static String url = "https://www.facebook.com/r.php";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement DD = driver.findElement(By.id("month"));
		Select monthS= new Select(DD);
		DD = driver.findElement(By.id("day"));
		Select dayS= new Select(DD);
		DD = driver.findElement(By.id("year"));
		Select yearS= new Select(DD);
		int monthL=monthS.getOptions().size()-1;
		int dayL=dayS.getOptions().size()-1;
		int yearL=yearS.getOptions().size()-1;
		
		if(monthL==12) {
			System.out.println("Options for month is = " +monthL);
		}else {
			System.out.println("Options for month is not = 12");
		}
		if(dayL==31) {
			System.out.println("Options for month is = " +dayL);
		}else {
			System.out.println("Options for month is not = 31");
		}
		if(yearL==115) {
			System.out.println("Options for month is = " +yearL);
		}else {
			System.out.println("Options for month is not = 115");
		}
		monthS.selectByVisibleText("Aug");
		dayS.selectByVisibleText("4");
		yearS.selectByVisibleText("1976");
		
		
	}

}
