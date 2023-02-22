package com.pom.feb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	public void type(By locator, String text) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	
	public boolean isDisplayed(By locator) {
		return find(locator).isDisplayed();
	}
	
	public void click(By locator) {
		find(locator).click();
	}

}
