package com.syntax.class12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.class12.utils.BaseClass;

public class DashboardPage extends BaseClass{
	@FindBy(css = "a#welcome")
	public WebElement welcomeAdmin;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

}
