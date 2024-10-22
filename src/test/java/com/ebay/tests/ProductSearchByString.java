package com.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ebay.base.Base;
import com.ebay.pages.HomePage;
import com.ebay.utils.Action;

public class ProductSearchByString extends Base {

	@Test
	public void ProductSearch() throws Throwable {

		logger.info("Step 1: Go to ebay.com");

		logger.info("Step 2: Type search string in the search bar. For example: MacBook.");
		String searchString = "MacBook";
		Action.type(HomePage.searchInput(driver), searchString);

		logger.info("Step 3: Change Search Category:Computers/Tablets & Networking and click.");
		Action.selectByIndex(HomePage.categoryDropdown(driver), 11);
		Action.click(HomePage.searchButton(driver), "searchOption");

		logger.info("Step 4: Verify that the page loads completely.");
		Assert.assertTrue(Action.isPageLoaded());

		logger.info("Step 5: Verify that the first result name matches with the search string.");
		String expectedString = "Cell Phone & Smartphone Parts between US $250.00 and US $500.00";
		String actualString = Action.getText(HomePage.getFirstResultNameElement(driver), "Results");
		Assert.assertEquals(actualString, expectedString,
				"Verification Failed:First result name does not match the search string.");

	}

}
