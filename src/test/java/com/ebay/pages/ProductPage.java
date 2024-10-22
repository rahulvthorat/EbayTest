package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public static WebElement element;

	public static WebElement shopByCategory(WebDriver driver) {
		return driver.findElement(By.id("gh-shop-a"));

	}

	public static WebElement shopByElectronics(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[2]/li[4]/a"));

	}

	public static WebElement CellPhonesSmartphones(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'Cell Phone & Smartphone Parts')]"));

	}

	public static WebElement filter_link(WebDriver driver) {
		return driver.findElement(By.cssSelector("button[aria-label='All Filters']"));

	}

	public static WebElement condition(WebDriver driver) {
		return driver.findElement(
				By.xpath("/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/span[1]"));

	}

	public static WebElement addNewConditionFilter(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/span[1]/span[1]/input[1]"));

	}

	public static WebElement Price(WebDriver driver) {
		return driver.findElement(
				By.xpath("/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[8]/span[1]"));

	}

	public static WebElement itemsPriced1(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/ul[1]/li[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));

	}

	public static WebElement itemsPriced2(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/ul[1]/li[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));

	}

	public static WebElement Location(WebDriver driver) {
		return driver.findElement(
				By.xpath("/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[10]/span[1]"));

	}

	public static WebElement US_Location(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[2]/span[1]/span[1]/input[1]"));

	}

	public static WebElement appyFilter(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[13]/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]"));

	}

	public static WebElement text_Result(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='b-pageheader__text']\r\n"));

	}

}
