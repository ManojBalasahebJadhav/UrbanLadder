package com.mindtree.pageObj;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.LoginPageUi;

public class LoginPage {
	
	WebDriver driver;
	WDriverHelper helper;
	LoginPageUi ui;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new LoginPageUi();
	}
	
	public void sendEmail(String data) throws InterruptedException {
		helper.sendKey(ui.emailUi,driver,data);
		System.out.println("Successfully filled");
	}
	
	public void sendPassword(String data) throws InterruptedException {
		helper.sendKey(ui.passUi,driver,data);
		System.out.println("Successfully filled");
	}
	
	public void clickOnSub() throws InterruptedException {
		helper.clickOn(ui.submitUi,driver);
		System.out.println("Successfully clicked");
	}

}

