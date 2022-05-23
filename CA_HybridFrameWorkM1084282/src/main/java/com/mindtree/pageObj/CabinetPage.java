package com.mindtree.pageObj;


import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.CabinentsUi;

public class CabinetPage {
	
	WebDriver driver;
	WDriverHelper helper;
	CabinentsUi ui;
	
	public CabinetPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new CabinentsUi() ;
	}
	
	public String getBarCabinetTitle() {
		String data=helper.getText(ui.barCabinetTitle,driver);
		return data;
	}

}
