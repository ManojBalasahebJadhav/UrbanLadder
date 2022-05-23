package com.mindtree.pageObj;


import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.GiftUi;


public class GiftsPage {

	WebDriver driver;
	WDriverHelper helper;
	GiftUi ui;
	
	public GiftsPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new GiftUi();
	}
	
	public String get() {
		String data=helper.getText(ui.gift,driver);
		return data;
	}
}