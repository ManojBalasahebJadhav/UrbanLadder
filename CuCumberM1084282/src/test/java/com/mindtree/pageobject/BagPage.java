package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.BeanBag;


public class BagPage {

	WebDriver driver;
	WebDriverHelper helper;
	BeanBag ui;
	
	public BagPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new BeanBag();
	}
	
	public String getbeanBagTitle() {
		String data=helper.getText(ui.beanBagTitle,driver);
		return data;
	}
}
