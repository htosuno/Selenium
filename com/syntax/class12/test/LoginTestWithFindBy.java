package com.syntax.class12.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.class12.pages.DashboardPage;
import com.syntax.class12.pages.LoginPageWithFindBy;
import com.syntax.class12.utils.BaseClass;

public class LoginTestWithFindBy {

	public static void main(String[] args) throws InterruptedException {
		BaseClass.setUp();
		LoginPageWithFindBy login = new LoginPageWithFindBy();
		DashboardPage dashboard=new DashboardPage();
		
		login.usernameTextbox.sendKeys("Admin");
		login.passwordTextbox.sendKeys("Hum@nhrm123");
		login.loginButton.click();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		String adminText = dashboard.welcomeAdmin.getText();
		System.out.println(adminText);
		
		Thread.sleep(2000);
		BaseClass.tearDown();
		
	}

}
