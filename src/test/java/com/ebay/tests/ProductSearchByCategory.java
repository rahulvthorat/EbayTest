package com.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ebay.base.Base;
import com.ebay.pages.ProductPage;
import com.ebay.utils.Action;

public class ProductSearchByCategory extends Base {

	@Test(priority = 1)
	public void navigateToCellPhones() throws Throwable {

		logger.info("Step 1: Click on 'Shop By Category'");
		Action.click(ProductPage.shopByCategory(driver), "Shop By Category");

		logger.info("Step 2: Click on 'Electronics > Cell Phones & accessories'");
		Action.click(ProductPage.shopByElectronics(driver), "Electronics > Cell Phones & accessories");

	}

	@Test(priority = 2, dependsOnMethods = "navigateToCellPhones")
	public void selectSmartphones() throws Throwable {
		logger.info("Step 3: Click on 'Cell Phones & Smartphones'");
		Action.pageLoadTimeOut(driver, 10);
		Action.click(ProductPage.CellPhonesSmartphones(driver), "Cell Phones & Smartphones");
	}

	@Test(priority = 3, dependsOnMethods = "selectSmartphones")
	public void applyFilters() throws Throwable {

		logger.info("Step 4: Click on 'All Filters'");
		Action.click(ProductPage.filter_link(driver), "All Filters");

		logger.info("Step 5: Apply filters - Condition, Price, Location");
		Action.click(ProductPage.condition(driver), "Condition");
		Action.click(ProductPage.addNewConditionFilter(driver), "Add Filter New");
		Action.click(ProductPage.Price(driver), "Price");
		Action.type(ProductPage.itemsPriced1(driver), "250");
		Action.type(ProductPage.itemsPriced2(driver), "500");

		logger.info("Step 6: Verify that the page loads completely.");
		Assert.assertTrue(Action.isPageLoaded());

		Action.click(ProductPage.Location(driver), "Locations");
		Action.click(ProductPage.US_Location(driver), "US");
		Action.click(ProductPage.appyFilter(driver), "Apply");

	}

	@Test(priority = 4, dependsOnMethods = "applyFilters")
	public void VerifyApplyFilter() throws Throwable {

		logger.info("Step 7: Verify filter tag");
		String expectedString = "Cell Phone & Smartphone Parts between US $250.00 and US $500.00";
		String actualString = Action.getText(ProductPage.text_Result(driver), "Results");

		Assert.assertEquals(expectedString, actualString, "Verification Failed: Filter tag does not match");

	}

}
