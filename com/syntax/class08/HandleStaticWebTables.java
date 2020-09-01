package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticWebTables {
	public static String url = "http://166.62.36.207/syntaxpractice/table-search-filter-demo.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of rows = " + rowData.size());

		Iterator<WebElement> it = rowData.iterator();
		while (it.hasNext()) {
			WebElement row = it.next();
			String rowText = row.getText();
			System.out.println(rowText);
		}
		List<WebElement> colsData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of cols = " + colsData.size());

		for (WebElement col : colsData) {
			String coltext = col.getText();
			System.out.println(coltext);
		}

	}

}
