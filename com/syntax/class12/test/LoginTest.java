package com.syntax.class12.test;

import com.syntax.class12.pages.LoginPage;
import com.syntax.class12.utils.BaseClass;

public class LoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		BaseClass.setUp();
		LoginPage loginpage = new LoginPage();
		
		loginpage.username.sendKeys("Admin");
		loginpage.password.sendKeys("Hum@nhrm123");
		loginpage.loginButton.click();
//		Thread.sleep(2000);
		
		BaseClass.tearDown();
	}
}
