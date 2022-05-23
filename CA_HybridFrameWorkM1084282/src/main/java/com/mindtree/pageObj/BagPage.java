package com.mindtree.pageObj;


import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.BagPageUi;


public class BagPage {

	WebDriver driver;
	WDriverHelper helper;
	BagPageUi ui;
	
	public BagPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new BagPageUi();
	}
	
	public String getbeanBagTitle() {
		String dataSt=helper.getText(ui.beanBagTitle,driver);
		return dataSt;
	}
}
