package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement element;

	public static WebElement searchInput(WebDriver driver) {
		return driver.findElement(By.id("gh-ac"));

	}

	public static WebElement categoryDropdown(WebDriver driver) {
		return driver.findElement(By.id("gh-cat"));

	}

	public static WebElement searchButton(WebDriver driver) {
		return driver.findElement(By.id("gh-btn"));

	}

	public static WebElement getFirstResultNameElement(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='MacBook']"));

	}

}
