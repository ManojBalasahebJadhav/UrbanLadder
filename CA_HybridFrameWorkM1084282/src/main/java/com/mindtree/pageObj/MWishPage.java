package com.mindtree.pageObj;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.WishUi;


public class MWishPage {
	
	WebDriver driver;
	WDriverHelper helper;
	WishUi ui;
	
	public MWishPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new WishUi();
	}
	
	public String getMyWish() {
		String data=helper.getText(ui.myWish,driver);
		return data;
	}

}
