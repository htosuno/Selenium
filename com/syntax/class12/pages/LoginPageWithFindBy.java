package com.syntax.class12.pages;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.class12.utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass {

	@FindBy(id = "txtUsername")
	public WebElement usernameTextbox;

	@FindBy(xpath = "//input[@id = 'txtPassword']")
	public WebElement passwordTextbox;

	@FindBy(css = "input#btnLogin")
	public WebElement loginButton;
	
//	@FindBy(xpath = "//table[@id = ''resultTable/tbody/tr']")
//	public List<WebElement> table;
	
	public LoginPageWithFindBy() {
		PageFactory.initElements(driver, this);
	}
}
