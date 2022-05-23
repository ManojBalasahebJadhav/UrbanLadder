package com.mindtree.pageObj;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.TvUnitUi;

public class TvUnitPage {
	
	WebDriver driver;
	WDriverHelper helper;
	TvUnitUi ui;
	
	public TvUnitPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new TvUnitUi();
	}
	
	public String getTvUnitTitle() {
		String data=helper.getText(ui.TvUnitTitle,driver);
		return data;
	}

}
