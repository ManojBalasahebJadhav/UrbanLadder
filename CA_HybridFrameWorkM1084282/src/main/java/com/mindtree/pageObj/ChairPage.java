package com.mindtree.pageObj;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusable.WDriverHelper;
import com.mindtree.uistore.ChairUi;

public class ChairPage {

	WebDriver driver;
	WDriverHelper helper;
	ChairUi ui;
	
	public ChairPage(WebDriver driver) {
		this.driver=driver;
		helper=new WDriverHelper();
		ui=new ChairUi();
	}
	
	public void AddWish() {
		helper.clickOn(ui.studyChairAddUi,driver);
		System.out.println("Successfully added in wishlist");
	}
}
