package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.CabinentsUi;

public class CabinetPage {
	
	WebDriver driver;
	WebDriverHelper helper;
	CabinentsUi ui;
	
	public CabinetPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new CabinentsUi() ;
	}
	
	public String getBarCabinetTitle() {
		String data=helper.getText(ui.barCabinetTitle,driver);
		return data;
	}

}
