package com.mindtree.runner;


import org.testng.Assert;

import org.testng.annotations.Test;

import com.mindtree.pageObj.BagPage;
import com.mindtree.pageObj.BaseClass;
import com.mindtree.pageObj.CabinetPage;
import com.mindtree.pageObj.GiftsPage;
import com.mindtree.pageObj.MenuPage;
import com.mindtree.pageObj.MWishPage;
import com.mindtree.pageObj.ChairPage;
import com.mindtree.pageObj.TvUnitPage;


public class AllTestCases extends BaseClass{
	
	@Test(priority=1)
	public void test1() throws InterruptedException {
		
		logger=report.createTest("Sofas");
		logger.info("Starting Test to check whether Sofas title find or not");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDeal();
		menu.clickOnSofas();
		Assert.assertEquals(menu.getSofasTitle(),"Sofas");
		logger.pass("Sofas assert successfully");
	}
	
	@Test(priority=2)
	public void test2() throws InterruptedException {
		logger=report.createTest("study table");
		logger.info("Starting Test to check whether click on study tables");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDeal();
		menu.clickOnstudyTable();
		Assert.assertTrue(menu.getStudyTableTitle().equals("Study Tables"),"not Found");
		logger.pass("Click on Study table successfully");
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
		logger=report.createTest("Bean Bags");
		logger.info("Starting Test to check whether click on Bean Bags");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnLiving();
		menu.clickOnBean();
		BagPage bag=new BagPage(driver);
		Assert.assertTrue(bag.getbeanBagTitle().equals("Bean Bags"),"not Found");
		logger.pass("Click on Bean bags successfully");
	}
	
	@Test(priority=4)
	public void test4() throws InterruptedException {
		logger=report.createTest("Tv Unit");
		logger.info("Starting Test to check whether click on TV Unit");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnLiving();
		menu.clickOnTvUnit();
		TvUnitPage tv=new TvUnitPage(driver);
		Assert.assertTrue(tv.getTvUnitTitle().equals("TV Units"),"Not Found");
		logger.pass("Click on Tv Unit successfully");
		
	}
	
	@Test(priority=5)
	public void test5() throws InterruptedException {
		logger=report.createTest("Wishlist");
		logger.info("Starting Test to check whether click on WishList");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnWish();
		MWishPage tv=new MWishPage(driver);
		Assert.assertTrue(tv.getMyWish().equals("My Wishlist"),"Not Found");
		logger.pass("Click on Wishlist successfully");
		
		
		
	}
	
	@Test(priority=6)
	public void test6() throws InterruptedException {
		logger=report.createTest("Bar Cabinets");
		logger.info("Starting Test to check whether click on Bar Cabinets");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDinning();
		menu.clickOnCabinet();
		CabinetPage cabinet=new CabinetPage(driver);
		Assert.assertTrue(cabinet.getBarCabinetTitle().equals("Bar Cabinets"),"Not Found");
		logger.pass("Click on Bar Cabinets successfully");
		
		
	}
	
	@Test(priority=7)
	public void test7() throws InterruptedException {
		logger=report.createTest("Gift");
		logger.info("Starting Test to check whether click on Gift");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnGift();
		GiftsPage gift=new GiftsPage(driver);
		System.out.println(gift.get());
		driver.navigate().back();
		logger.pass("Click on Gift successfully");

	}
	
	@Test(priority=8)
	public void test8() throws InterruptedException {
		logger=report.createTest("Study chair");
		logger.info("Starting Test to check whether Study chair add in wishlist");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnStudy();
		menu.clickOnStudyChair();
		ChairPage chair=new ChairPage(driver);
		chair.AddWish();
		logger.pass("Added chair in wishlist successfully");
	}
	
	@Test(priority=9)
	public void test9() throws InterruptedException {
		logger=report.createTest("Decor");
		logger.info("Starting Test to check whether click on wall");
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDecor();
		menu.clickOnWall();
		logger.pass("Click on wall successfully");
	} 
	@Test(priority=10)
	public void test10() throws InterruptedException {
		
		logger=report.createTest("Track order");
		logger.info("Starting Test to check whether click on track order");
		MenuPage menu=new MenuPage(driver);
		menu.clickOntrackOrder();
		logger.pass("Click on track order successfully");
		
		
	}

}
