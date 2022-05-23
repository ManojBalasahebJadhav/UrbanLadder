package com.mindtree.pageObj;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.HomePageUi;

public class HomePage {
	
	WebDriver driver;
	WDriverHelper helper;
	HomePageUi ui;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new HomePageUi();
	}
	
	public void clickOnAdmin() {
		helper.clickOn(ui.adminUi,driver);
		System.out.println("Successfully click");
	}
	
	public void clickOnLogin() {
		helper.clickOn(ui.LogIn,driver);
		System.out.println("Successfully click on login");
	}

}
